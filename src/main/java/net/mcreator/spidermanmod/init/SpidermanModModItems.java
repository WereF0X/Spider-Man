
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidermanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.spidermanmod.item.WebShooterItem;
import net.mcreator.spidermanmod.item.SpiderManSuitItem;
import net.mcreator.spidermanmod.item.EmptywebshooterItem;
import net.mcreator.spidermanmod.SpidermanModMod;

public class SpidermanModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpidermanModMod.MODID);
	public static final RegistryObject<Item> WEB_SHOOTER = REGISTRY.register("web_shooter", () -> new WebShooterItem());
	public static final RegistryObject<Item> SPIDERMANALIVE_SPAWN_EGG = REGISTRY.register("spidermanalive_spawn_egg", () -> new ForgeSpawnEggItem(SpidermanModModEntities.SPIDERMANALIVE, -65536, -16776961, new Item.Properties()));
	public static final RegistryObject<Item> SPIDER_MAN_SUIT_HELMET = REGISTRY.register("spider_man_suit_helmet", () -> new SpiderManSuitItem.Helmet());
	public static final RegistryObject<Item> SPIDER_MAN_SUIT_CHESTPLATE = REGISTRY.register("spider_man_suit_chestplate", () -> new SpiderManSuitItem.Chestplate());
	public static final RegistryObject<Item> SPIDER_MAN_SUIT_LEGGINGS = REGISTRY.register("spider_man_suit_leggings", () -> new SpiderManSuitItem.Leggings());
	public static final RegistryObject<Item> SPIDER_MAN_SUIT_BOOTS = REGISTRY.register("spider_man_suit_boots", () -> new SpiderManSuitItem.Boots());
	public static final RegistryObject<Item> EMPTYWEBSHOOTER = REGISTRY.register("emptywebshooter", () -> new EmptywebshooterItem());
}
