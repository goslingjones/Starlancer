package com.goslingjones.starlancer.examples;

import java.util.List;

import com.goslingjones.starlancer.Balancer;
import com.goslingjones.starlancer.Connection;
import com.goslingjones.starlancer.Server;
import com.goslingjones.starlancer.authentication.UsernameAndPassword;
import com.goslingjones.starlancer.strategy.RandomStrategy;

public class RandomConnectionExample {
	
	static Server[] servers = {
			new Server("Server A", "192.168.15.6", 80),
			new Server("Server B", "192.168.15.7", 80),
			new Server("Server C", "192.168.15.8", 80)
	};
	
	static RandomStrategy randomStrategy = new RandomStrategy();
	
	public static void main(String[] args) {
		
		/* Create a Random Strategy Balancer */
		Balancer balancer = new Balancer(randomStrategy, servers);
		
		/* Create a default connection using username and password */
		Connection defaultConnection = new Connection(
				new UsernameAndPassword(
						"default-user",
						"default-password"
			)
		);
		
		balancer.openConnection(defaultConnection);
		balancer.openConnection(defaultConnection);
		balancer.openConnection(defaultConnection);
	}

}
