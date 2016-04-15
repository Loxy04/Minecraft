package com.loxy.taco;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.loxy.taco.init.TacotsticItems;;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class Tacotastic
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy; 
	
    @EventHandler
    public void preIint(FMLPreInitializationEvent event)
    {
    	TacotsticItems.init();
    	TacotsticItems.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    proxy.registerRenders();
    {
    	ModRecipes.addRecipes();
    }
}
    

