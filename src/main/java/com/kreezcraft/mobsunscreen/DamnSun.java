package com.kreezcraft.mobsunscreen;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DamnSun {

	@SubscribeEvent
	public static EntityEvent theSunlight(EntityEvent e) {
		Entity mob = e.getEntity();
		if (mob != null)
			if (mob instanceof EntitySkeleton || mob instanceof EntityZombie) {
				World world = mob.getEntityWorld();
				if (mob.getPosition() != null)
					if (world != null && world.canSeeSky(mob.getPosition()) && mob.isBurning()) {

						mob.extinguish();
						System.out.println("Sunscreen!");
						e.setCanceled(true);
					}
			}
		return e;
	}
}
