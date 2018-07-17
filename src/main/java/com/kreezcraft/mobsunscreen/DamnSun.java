package com.kreezcraft.mobsunscreen;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class DamnSun {

	@SubscribeEvent
	public static void entityUpdate(LivingUpdateEvent event) {
		Entity mob;
		if (event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntitySkeleton) {
			mob = event.getEntity();
			World world = mob.getEntityWorld();
			boolean day = world.isDaytime();
			BlockPos blockpos = mob.getPosition();
			if (world.canSeeSky(blockpos))
				if (day) {
					if (mob.isBurning() && !mob.isInLava())
						mob.extinguish();
				}
		}
	}

}
