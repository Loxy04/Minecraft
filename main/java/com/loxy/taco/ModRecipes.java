package com.loxy.taco;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void addRecipes()
	{
		 GameRegistry.addRecipe(new ItemStack(Blocks.obsidian),
	    		" A ",
	    		"CED",
	    		" A ",
	    		'A', Items.bread,
	    		'C',Items.carrot,
	    		'E', Items.cooked_beef,
	    		'D', Items.wheat);
	    
	    	
	    GameRegistry.addSmelting(Items.bread, new ItemStack(Items.bread), 1F);
	}
	    @EventHandler
	    public void postInit(FMLInitializationEvent event)
	    {
	}
}
