package com.stiforr.test;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.stiforr.test.blocks.BlockLiveOre;
import com.stiforr.test.help.Reference;
import com.stiforr.test.help.RegisterHelper;
import com.stiforr.test.items.ItemLiveIngot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Test 
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		RegisterHelper.init();

		RegisterHelper.registerBlocksAndItems();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){

		RegisterHelper.registerRecipes();

	}

}
