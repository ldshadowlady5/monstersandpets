package com.ldshadowlady.monstersandpets.entity.ai;

import com.ldshadowlady.monstersandpets.entity.EntityPet;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.math.Vec3d;

public final class EntityAIRide extends EntityAIBase {
	private final EntityPet entity;

	private State state;

	public EntityAIRide(EntityPet entity) {
		this.entity = entity;
		this.state = new StateIdle();
		setMutexBits(1);
	}

	@Override
	public boolean shouldExecute() {
		return entity.isTamed() && !entity.isInWater() && state.isRiding();
	}

	@Override
	public void startExecuting() {
		super.startExecuting();
		state.onStart();
	}

	@Override
	public void resetTask() {
		super.resetTask();
		setState(new StateIdle()).onReset();
	}

	@Override
	public void updateTask() {
		super.updateTask();
		setState(state.update());
	}

	public void toggle() {
		if (state.isRiding()) {
			stop();
		} else {
			start();
		}
	}

	public void ride(Entity entity) {
		setState(new StateRiding(entity));	
	}

	private void start() {
		if (!state.isRiding()) {
			EntityLivingBase owner = entity.getOwner();
			if (owner != null) {
				setState(new StateJump(owner));
			}
		}
	}

	private void stop() {
		if (state.isRiding()) {
			setState(new StateIdle());	
		}
	}

	private State setState(State state) {
		if (this.state != state) {
			this.state = state;
			this.state.onTransition();
		}
		return this.state;
	}

	private abstract class State {
		public abstract boolean isRiding();

		public void onTransition() {}

		public void onStart() {}

		public void onReset() {}

		public abstract State update();
	}

	private final class StateIdle extends State {
		@Override
		public boolean isRiding() {
			return false;
		}

		@Override
		public void onReset() {
			super.onReset();
			Entity vehicle = entity.getRidingEntity();
			if (vehicle != null) {
				entity.dismountRidingEntity();
				for (Entity passenger : entity.getPassengers()) {
					passenger.startRiding(vehicle);
				}
			}
			entity.setSitting(false);
		}

		@Override
		public State update() {
			return this;
		}
	}

	private final class StateRiding extends State {
		private final Entity owner;

		private StateRiding(Entity owner) {
			this.owner = owner;
		}

		@Override
		public boolean isRiding() {
			return true;
		}

		@Override
		public void onTransition() {
			entity.setSitting(true);
			entity.playSound(SoundEvents.BLOCK_CLOTH_STEP, 0.8F, 0.8F + entity.getRNG().nextFloat() + 0.3F);
			entity.createHearts();
		}

		@Override
		public State update() {
			if (owner.isPassenger(entity)) {
				return this;	
			}
			return new StateIdle();
		}
	}

	private final class StateJump extends State {
		private final EntityLivingBase owner;

		private int time;

		private StateJump(EntityLivingBase owner) {
			this.owner = owner;
		}

		@Override
		public boolean isRiding() {
			return true;
		}

		@Override
		public void onStart() {
			super.onStart();
			entity.getNavigator().clearPath();
			double lx = entity.posX, ly = entity.posY, lz = entity.posZ;
			double tx = owner.posX, ty = owner.getEntityBoundingBox().maxY, tz = owner.posZ;
			double endGain = ty - ly;
			double dx = tx - lx;
			double dz = tz - lz;
			double hDist = Math.sqrt(dx * dx + dz * dz);
			double gain = endGain <= 0 ? hDist / 2 : 0;
			double maxGain = Math.max(gain, endGain + gain);
			double a = -hDist * hDist / (4 * maxGain);
			double slope = -hDist / (2 * a) - Math.sqrt(hDist * hDist + 4 * a * endGain) / (2 * a);
			entity.motionY = Math.sqrt(maxGain * 0.27);
			if (Double.isFinite(slope)) {
				double vh = entity.motionY / slope;
				entity.motionX = vh * (dx / hDist);
				entity.motionZ = vh * (dz / hDist);
			} else {
				entity.motionX = 0;
				entity.motionZ = 0;
			}
			entity.velocityChanged = true;
		}

		@Override
		public State update() {
			if (++time >= 20 * 10 || entity.motionY < 0) {
				return new StateFall(owner);
			}
			return this;
		}
	}

	private final class StateFall extends State {
		private final EntityLivingBase owner;

		private StateFall(EntityLivingBase owner) {
			this.owner = owner;
		}

		@Override
		public boolean isRiding() {
			return true;
		}

		@Override
		public State update() {
			if (entity.getEntityBoundingBox().intersects(owner.getEntityBoundingBox())) {
				Entity e = getTop(owner);
				if (entity.startRiding(e, false, false)) {
					return new StateRiding(e);
				}
				return new StateIdle();
			}
			Vec3d src = entity.getPositionVector();
			Vec3d dst = new Vec3d(owner.posX, owner.getEntityBoundingBox().maxY - 0.025, owner.posZ);
			Vec3d vec = dst.subtract(src).normalize().scale(0.35);
			entity.motionX = vec.x;
			entity.motionY = vec.y;
			entity.motionZ = vec.z;
			entity.velocityChanged = true;
			return this;
		}

		private Entity getTop(Entity entity) {
			return entity.getPassengers().stream()
				.findFirst()
				.map(this::getTop)
				.orElse(entity);
		}
	}
}
