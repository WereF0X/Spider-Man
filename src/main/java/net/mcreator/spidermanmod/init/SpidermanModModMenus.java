
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidermanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.spidermanmod.world.inventory.RecipesMenu;
import net.mcreator.spidermanmod.SpidermanModMod;

public class SpidermanModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SpidermanModMod.MODID);
	public static final RegistryObject<MenuType<RecipesMenu>> RECIPES = REGISTRY.register("recipes", () -> IForgeMenuType.create(RecipesMenu::new));
}
