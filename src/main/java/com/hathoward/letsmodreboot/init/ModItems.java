package com.hathoward.letsmodreboot.init;

import com.hathoward.letsmodreboot.item.ItemLMRB;
import com.hathoward.letsmodreboot.item.ItemMapleLeaf;
import com.hathoward.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
