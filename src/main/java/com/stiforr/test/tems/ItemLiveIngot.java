package com.stiforr.test.tems;

import com.stiforr.test.help.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLiveIngot extends Item 
{
	

	public ItemLiveIngot()
	{
		super();
		setUnlocalizedName("TritIngot");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
		
	}
}
		