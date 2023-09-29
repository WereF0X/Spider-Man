package net.mcreator.spidermanmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class SpidermanaliveThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Spider-Man: What have i done?!"), false);
	}
}
