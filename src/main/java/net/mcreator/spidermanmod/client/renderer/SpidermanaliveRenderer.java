
package net.mcreator.spidermanmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.spidermanmod.entity.SpidermanaliveEntity;

public class SpidermanaliveRenderer extends HumanoidMobRenderer<SpidermanaliveEntity, HumanoidModel<SpidermanaliveEntity>> {
	public SpidermanaliveRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SpidermanaliveEntity entity) {
		return new ResourceLocation("spiderman_mod:textures/entities/spiderman_homecoming_hd_skin.png");
	}
}
