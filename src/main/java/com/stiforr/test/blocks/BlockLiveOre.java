package com.stiforr.test.blocks;

import com.stiforr.test.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLiveOre extends Block
{

	

	public BlockLiveOre()
	{
		super(Material.rock);
		setBlockName("TritOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(5.0F);
		setLightLevel(0.5F);
	}
}
