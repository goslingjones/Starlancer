package com.goslingjones.starlancer.strategy;

import com.goslingjones.starlancer.Server;

public interface Strategy {
	
	public Server getServer(Server[] servers);
	
}
