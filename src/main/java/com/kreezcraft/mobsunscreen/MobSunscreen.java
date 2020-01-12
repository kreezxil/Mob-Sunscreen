package com.kreezcraft.mobsunscreen;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MobSunscreen.MODID)
public class MobSunscreen {
	public static final String MODID = "mobsunscreen";
	public static final String NAME = "Mob Sunscreen";
	public static final String VERSION = "@version@";

	public static MobSunscreen instance;

	private static final Logger LOGGER = LogManager.getLogger();

	private void doClientStuff(final FMLClientSetupEvent event) {
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private void processIMC(final InterModProcessEvent event) {
	}
	private void setup(final FMLCommonSetupEvent event) {
	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
	}


}
