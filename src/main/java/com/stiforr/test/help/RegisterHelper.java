package com.stiforr.test.help;

import com.stiforr.test.blocks.BlockLiveOre;
import com.stiforr.test.items.ItemLiveIngot;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper 
{

	public static Block LiveOre;
	public static Item LiveIngot;

	public static void init(){

		LiveOre = new BlockLiveOre();
		LiveIngot = new ItemLiveIngot();


	}

	public static void registerBlocksAndItems(){

	registerBlock(LiveOre);
	registerItem(LiveIngot);

	}

	public static void registerRecipes(){

		GameRegistry.addSmelting(TritOre, new ItemStack(TritIngot, 1), 0.1F);

	}

	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
		
		
	}

}
