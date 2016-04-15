package com.loxy.taco;

import com.loxy.taco.init.TacotsticItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		TacotsticItems.registerRenders();
	}
}
