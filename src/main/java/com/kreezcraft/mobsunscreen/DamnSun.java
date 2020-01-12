package com.kreezcraft.mobsunscreen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class DamnSun {

	@SubscribeEvent
	public static void entityUpdate(LivingUpdateEvent event) {
		if (event.getEntity() instanceof PlayerEntity)
			return;

			World world = event.getEntity().getEntityWorld();
			boolean day = world.isDaytime();
			BlockPos blockpos = event.getEntity().getPosition();
			if (world.canBlockSeeSky(blockpos)) {
				if (day) {
					if (event.getEntity().isBurning() && !event.getEntity().isInLava())
						event.getEntity().extinguish();
				}
		}
	}
}
