package com.hathoward.letsmodreboot;

import com.hathoward.letsmodreboot.handler.ConfigurationHandler;
import com.hathoward.letsmodreboot.init.ModBlocks;
import com.hathoward.letsmodreboot.init.ModItems;
import com.hathoward.letsmodreboot.network.PacketHandler;
import com.hathoward.letsmodreboot.proxy.IProxy;
import com.hathoward.letsmodreboot.reference.Reference;
import com.hathoward.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot 
{
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		PacketHandler.init();
		ModItems.init();
		ModBlocks.init();
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerEventHandlers();
		
		proxy.registerTileEntities();
		
		proxy.initRenderingAndTextures();
		
		
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void posyInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete!");
	}
}
