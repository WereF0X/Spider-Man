
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidermanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.spidermanmod.SpidermanModMod;

public class SpidermanModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpidermanModMod.MODID);
	public static final RegistryObject<CreativeModeTab> SPIDER_MAN = REGISTRY.register("spider_man",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.spiderman_mod.spider_man")).icon(() -> new ItemStack(Items.SPIDER_EYE)).displayItems((parameters, tabData) -> {
				tabData.accept(SpidermanModModItems.WEB_SHOOTER.get());
				tabData.accept(SpidermanModModItems.SPIDERMANALIVE_SPAWN_EGG.get());
				tabData.accept(SpidermanModModItems.SPIDER_MAN_SUIT_HELMET.get());
				tabData.accept(SpidermanModModItems.SPIDER_MAN_SUIT_CHESTPLATE.get());
				tabData.accept(SpidermanModModItems.SPIDER_MAN_SUIT_LEGGINGS.get());
				tabData.accept(SpidermanModModItems.SPIDER_MAN_SUIT_BOOTS.get());
				tabData.accept(SpidermanModModItems.EMPTYWEBSHOOTER.get());
			})

					.build());
}
