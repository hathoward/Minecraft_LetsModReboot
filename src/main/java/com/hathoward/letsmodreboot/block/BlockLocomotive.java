package com.hathoward.letsmodreboot.block;

import com.hathoward.letsmodreboot.reference.RenderIds;
import com.hathoward.letsmodreboot.tileentity.TileEntityLocomotive;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLocomotive extends BlockLMRB implements ITileEntityProvider
{
	public BlockLocomotive()
	{
		super();
		this.setBlockName("locomotive");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int metadata)
	{
	   return new TileEntityLocomotive();
	}
    
    @Override
    public boolean renderAsNormalBlock() 
    {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
    	return false;
    }
	
    @Override
    public int getRenderType() 
    {
            return RenderIds.locomotive;
    }
}
