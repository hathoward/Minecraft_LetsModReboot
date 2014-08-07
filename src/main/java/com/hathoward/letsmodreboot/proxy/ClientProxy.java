package com.hathoward.letsmodreboot.proxy;

import com.hathoward.letsmodreboot.client.renderer.tileentity.TileEntityRendererLocomotive;
import com.hathoward.letsmodreboot.init.ModBlocks;
import com.hathoward.letsmodreboot.reference.RenderIds;
import com.hathoward.letsmodreboot.tileentity.TileEntityLocomotive;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{

	@Override
	public void initRenderingAndTextures() {
		// TODO Auto-generated method stub
		RenderIds.locomotive = -1;
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLocomotive.class, new TileEntityRendererLocomotive());
	}

	@Override
	public void registerKeybindings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(String soundName, float xCoord, float yCoord,
			float zCoord, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}
	
}
