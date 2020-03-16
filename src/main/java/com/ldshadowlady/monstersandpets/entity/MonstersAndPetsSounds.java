package com.ldshadowlady.monstersandpets.entity;

import java.util.List;

import com.google.common.collect.Lists;
import com.ldshadowlady.monstersandpets.MonstersAndPets;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = MonstersAndPets.MODID)
public class MonstersAndPetsSounds {
	private static List<SoundEvent> sounds = Lists.newArrayList();
	//monsters
	public static final SoundEvent NETHER_CREATURE_AMBIENT = createSound("nether_creature.ambient");
	public static final SoundEvent NETHER_CREATURE_DEATH = createSound("nether_creature.death");
	public static final SoundEvent NETHER_CREATURE_HURT = createSound("nether_creature.hurt");
	public static final SoundEvent PIG_MAN_AMBIENT = createSound("pig_man.ambient");
	public static final SoundEvent PIG_MAN_DEATH = createSound("pig_man.death");
	public static final SoundEvent PIG_MAN_HURT = createSound("pig_man.hurt");
	public static final SoundEvent SLENDERMAN_AMBIENT = createSound("slenderman.ambient");
	public static final SoundEvent SLENDERMAN_DEATH = createSound("slenderman.death");
	public static final SoundEvent SLENDERMAN_HURT = createSound("slenderman.hurt");
	public static final SoundEvent WENDIGO_AMBIENT = createSound("wendigo.ambient");
	public static final SoundEvent WENDIGO_DEATH = createSound("wendigo.death");
	public static final SoundEvent WENDIGO_HURT = createSound("wendigo.hurt");
	public static final SoundEvent HAUNTED_TREE_AMBIENT = createSound("haunted_tree.ambient");
	public static final SoundEvent HAUNTED_TREE_DEATH = createSound("haunted_tree.death");
	public static final SoundEvent HAUNTED_TREE_HURT = createSound("haunted_tree.hurt");
	public static final SoundEvent NO_FACE_AMBIENT = createSound("no_face.ambient");
	public static final SoundEvent NO_FACE_DEATH = createSound("no_face.death");
	public static final SoundEvent NO_FACE_HURT = createSound("no_face.hurt");
	public static final SoundEvent CLOWN_AMBIENT = createSound("clown.ambient");
	public static final SoundEvent CLOWN_DEATH = createSound("clown.death");
	public static final SoundEvent CLOWN_HURT = createSound("clown.hurt");
	public static final SoundEvent FNAF_DEATH = createSound("fnaf.death");
	public static final SoundEvent FNAF_HURT = createSound("fnaf.hurt");
	public static final SoundEvent BONNIE = createSound("fnaf.bonnie");
	public static final SoundEvent CHICA = createSound("fnaf.chica");
	public static final SoundEvent FOXY = createSound("fnaf.foxy");
	public static final SoundEvent FREDDY = createSound("fnaf.freddy");
	public static final SoundEvent PUPPET = createSound("fnaf.puppet");
	public static final SoundEvent YANDERE_CHAN = createSound("yandere.yandere_chan");
	public static final SoundEvent YANDERE_CHAINSAW = createSound("yandere.yandere_chainsaw");

	//pets
	public static final SoundEvent MYSTICAL_GOAT_AMBIENT = createSound("mystical_goat.ambient");
	public static final SoundEvent MYSTICAL_GOAT_DEATH = createSound("mystical_goat.death");
	public static final SoundEvent MYSTICAL_GOAT_HURT = createSound("mystical_goat.hurt");
	public static final SoundEvent BOO_AMBIENT = createSound("boo.ambient");
	public static final SoundEvent BOO_DEATH = createSound("boo.death");
	public static final SoundEvent BOO_HURT = createSound("boo.hurt");
	public static final SoundEvent GOOSE_AMBIENT = createSound("goose.ambient");
	public static final SoundEvent GOOSE_DEATH = createSound("goose.death");
	public static final SoundEvent GOOSE_HURT = createSound("goose.hurt");
	
	
	
	private static SoundEvent createSound(String name) {
		ResourceLocation resourceLocation = new ResourceLocation(MonstersAndPets.MODID, name);
		SoundEvent sound = new SoundEvent(resourceLocation);
		sound.setRegistryName(resourceLocation);
		sounds.add(sound);
		return sound;
	}

	@SubscribeEvent
	public static void registerSound(RegistryEvent.Register<SoundEvent> event) {
		for (SoundEvent sound : sounds) {
			event.getRegistry().register(sound);
		}
	}


}