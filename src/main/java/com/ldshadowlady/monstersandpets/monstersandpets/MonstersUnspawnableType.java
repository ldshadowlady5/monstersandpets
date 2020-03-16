package com.ldshadowlady.monstersandpets.monstersandpets;

import java.awt.*;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.EntityMonsterUnspawnable;
import com.ldshadowlady.monstersandpets.entity.monster.*;
import net.minecraft.util.ResourceLocation;

public enum MonstersUnspawnableType {
	NO_FACE(EntityNoFace.class, "no_face",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	CLOWN(EntityClown.class, "clown",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	CLOWNGIRL(EntityClownGirl.class, "clown_girl",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	CLOWNDARK(EntityClownDark.class, "clown_dark",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	CLOWNSPOOKY(EntityClownSpooky.class, "clown_spooky",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	BONNIE(EntityBonnie.class, "bonnie",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	FOXY(EntityFoxy.class, "foxy",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	CHICA(EntityChica.class, "chica",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	PUPPET(EntityPuppet.class, "puppet",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	FREDDY(EntityFreddy.class, "freddy",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	YANDERE_CHAN(EntityYandereChan.class, "yandere_chan",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	YANDERE_OSANA(EntityYandereOsana.class, "yandere_osana",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	YANDERE_KOKONA(EntityYandereKokona.class, "yandere_kokona",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	YANDERE_KATELYN(EntityYandereKatelyn.class, "yandere_katelyn",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	YANDERE_RYUSEI(EntityYandereRyusei.class, "yandere_ryusei",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	YANDERE_SENPAI(EntityYandereSenpai.class, "yandere_senpai",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	),
	SKELETON_SPIDER(EntitySkeletonSpider.class, "skeleton_spider",
		new Color(255, 255, 255),
		new Color(15, 15, 15)
	)
	;
	;

	private final Class<? extends EntityMonsterUnspawnable> entityClass;

	private final String name;

	private final ResourceLocation texture;

	private final Color primaryColor;

	private final Color secondaryColor;



	MonstersUnspawnableType(Class<? extends EntityMonsterUnspawnable> entityClass, String name, Color backgroundColor, Color foregroundColor) {
		this.entityClass = entityClass;
		this.name = name;
		this.texture = new ResourceLocation(MonstersAndPets.MODID, "textures/entity/" + name + ".png");
		this.primaryColor = backgroundColor;
		this.secondaryColor = foregroundColor;
	}

	public final Class<? extends EntityMonsterUnspawnable> getEntityClass() {
		return entityClass;
	}

	public final String getName() {
		return name;
	}

	public final ResourceLocation getTexture() {
		return texture;
	}

	public final int getBackgroundColor() {
		return primaryColor.getRGB();
	}

	public final int getForegroundColor() {
		return secondaryColor.getRGB();
	}
}

