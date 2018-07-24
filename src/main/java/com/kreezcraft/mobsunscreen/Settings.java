package com.kreezcraft.mobsunscreen;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Config(modid = MobSunscreen.MODID, category = "")
public class Settings {
	
	@Config.Comment({ "Oh, my! What besides Skeles and Zombos shouldn't get burned in the sun!" })
	@Config.Name("Sunscreen Application Center")
	public static SunscreenSettings sunscreenSettings = new SunscreenSettings();

	public static class SunscreenSettings {
		@Config.Comment({"A global setting. If you specify a mod here, you don't have to specify individual mobs later. Default: deadlymonsters"})
		@Config.Name("ModList")
		public String[] modList = new String[]{"dmonsters"};
		
		@Config.Comment({"Specific mobs that should have sunscreen applied. If the mod the mob belongs to is specified above this will be pointless. The format is modid:mobname all lowercase. Default: minecraft:skeleton, minecraft:zombie"})
		@Config.Name("MobList")
		public String[] mobList = new String[]{"minecraft:skeleton","minecraft:zombie"};
	}

	@SubscribeEvent
	public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(MobSunscreen.MODID)) {
			ConfigManager.sync(MobSunscreen.MODID, Config.Type.INSTANCE);
		}
	}

}
