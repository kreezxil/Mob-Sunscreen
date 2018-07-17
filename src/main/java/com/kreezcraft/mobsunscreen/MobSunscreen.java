package com.kreezcraft.mobsunscreen;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = MobSunscreen.MODID, name = MobSunscreen.NAME, version = MobSunscreen.VERSION)
public class MobSunscreen {
	public static final String MODID = "mobsunscreen";
	public static final String NAME = "Mob Sunscreen";
	public static final String VERSION = "@version@";

	@Mod.Instance
	public static MobSunscreen instance;

	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}
}
