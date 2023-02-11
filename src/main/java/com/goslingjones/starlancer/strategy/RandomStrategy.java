package com.goslingjones.starlancer.strategy;

import java.util.Random;

import com.goslingjones.starlancer.Server;

public class RandomStrategy implements Strategy {
	
	Random random = new Random();

	@Override
	public Server getServer(Server[] servers) {
		int serverIndex = random.nextInt(servers.length);
		return servers[serverIndex];
	}
	
}
