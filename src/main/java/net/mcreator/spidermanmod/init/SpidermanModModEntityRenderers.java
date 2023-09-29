
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidermanmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.spidermanmod.client.renderer.SpidermanaliveRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SpidermanModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SpidermanModModEntities.WEB_SHOOTER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SpidermanModModEntities.SPIDERMANALIVE.get(), SpidermanaliveRenderer::new);
	}
}
