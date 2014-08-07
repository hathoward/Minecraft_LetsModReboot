package com.hathoward.letsmodreboot.proxy;

public interface IProxy 
{
    public abstract void registerTileEntities();

    public abstract void initRenderingAndTextures();

    public abstract void registerEventHandlers();

    public abstract void registerKeybindings();

    public abstract void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch);
}
