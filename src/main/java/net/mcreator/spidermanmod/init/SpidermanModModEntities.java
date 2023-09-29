
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spidermanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.spidermanmod.entity.WebShooterEntity;
import net.mcreator.spidermanmod.entity.SpidermanaliveEntity;
import net.mcreator.spidermanmod.SpidermanModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpidermanModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SpidermanModMod.MODID);
	public static final RegistryObject<EntityType<WebShooterEntity>> WEB_SHOOTER = register("projectile_web_shooter",
			EntityType.Builder.<WebShooterEntity>of(WebShooterEntity::new, MobCategory.MISC).setCustomClientFactory(WebShooterEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpidermanaliveEntity>> SPIDERMANALIVE = register("spidermanalive",
			EntityType.Builder.<SpidermanaliveEntity>of(SpidermanaliveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpidermanaliveEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpidermanaliveEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SPIDERMANALIVE.get(), SpidermanaliveEntity.createAttributes().build());
	}
}
