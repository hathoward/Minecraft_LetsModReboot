package com.hathoward.letsmodreboot.reference;

import com.hathoward.letsmodreboot.utility.ResourceLocationHelper;

import net.minecraft.util.ResourceLocation;

public class Textures 
{
	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
	
    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
        public static final ResourceLocation LOCOMOTIVE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "locomotive.png");
    }
}
