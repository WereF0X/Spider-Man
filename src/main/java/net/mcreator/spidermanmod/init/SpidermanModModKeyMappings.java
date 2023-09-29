
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidermanmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.spidermanmod.network.RecipeskeybindMessage;
import net.mcreator.spidermanmod.SpidermanModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SpidermanModModKeyMappings {
	public static final KeyMapping RECIPESKEYBIND = new KeyMapping("key.spiderman_mod.recipeskeybind", GLFW.GLFW_KEY_Y, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SpidermanModMod.PACKET_HANDLER.sendToServer(new RecipeskeybindMessage(0, 0));
				RecipeskeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RECIPESKEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				RECIPESKEYBIND.consumeClick();
			}
		}
	}
}
