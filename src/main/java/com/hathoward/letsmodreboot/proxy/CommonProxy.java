package com.hathoward.letsmodreboot.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.hathoward.letsmodreboot.handler.ConfigurationHandler;
import com.hathoward.letsmodreboot.reference.Names;
import com.hathoward.letsmodreboot.tileentity.TileEntityLocomotive;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy
{
    public void registerEventHandlers()
    {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }
    
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityLocomotive.class, "tileEntityLocomotive");
    }
}
