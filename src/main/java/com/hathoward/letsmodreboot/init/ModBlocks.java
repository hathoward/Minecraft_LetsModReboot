package com.hathoward.letsmodreboot.init;

import com.hathoward.letsmodreboot.block.BlockFlag;
import com.hathoward.letsmodreboot.block.BlockLMRB;
import com.hathoward.letsmodreboot.block.BlockLocomotive;
import com.hathoward.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockLMRB flag = new BlockFlag();
	public static final BlockLMRB locomotive = new BlockLocomotive();
	
	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
		GameRegistry.registerBlock(locomotive, "locomotive");
	}
}
