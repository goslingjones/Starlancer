package com.goslingjones.starlancer;

import java.util.ArrayList;
import java.util.List;

import com.goslingjones.starlancer.log.Log;
import com.goslingjones.starlancer.strategy.Strategy;

public class Balancer {
	
	private List<Server> activeServers = new ArrayList<>();
	private Server[] servers;
	private Strategy strategy;
	
	public Balancer(Strategy strategy, Server[] servers) {
		this.strategy = strategy;
		this.servers = servers;
	}
	
	public Strategy getStrategy() {
		return this.strategy;
	}
	
	public List<Server> getActiveServers() {
		return activeServers;
	}
	
	/**
	 * Opens a connection to a server based on the strategy
	 * 
	 * @param connection
	 */
	public void openConnection(Connection connection) {
		Server server = strategy.getServer(servers);
		server.openConnection(connection);
		
		Log.add("[Selected Server] " + server.getName());
		
		if (! activeServers.contains(server)) {
			activeServers.add(server);
			Log.add("[" + server.getName() + "] is now active.");
		}
		
		else {
			Log.add("[" + server.getName() + "] is already active.");
		}
	}
}
