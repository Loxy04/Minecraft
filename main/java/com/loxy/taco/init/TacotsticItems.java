package com.loxy.taco.init;

import com.loxy.taco.*;
import com.sun.org.apache.xml.internal.security.signature.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TacotsticItems {
	
	public static Item taco_shell;
	
	public static void init(){
		taco_shell = new Item().setUnlocalizedName("taco_shell");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(taco_shell, taco_shell.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(taco_shell);
	}
		
	
	
	public static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(com.loxy.taco.Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
