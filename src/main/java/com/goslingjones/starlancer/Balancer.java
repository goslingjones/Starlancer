package com.goslingjones.starlancer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.goslingjones.starlancer.client.Client;
import com.goslingjones.starlancer.log.Log;
import com.goslingjones.starlancer.messages.request.RequestMessage;
import com.goslingjones.starlancer.messages.response.ResponseMessage;
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
	 * Sends a request to a server based on the strategy
	 * 
	 * @param connection
	 * @return ResponseMessage
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public ResponseMessage sendRequest(RequestMessage requestMessage) throws IOException, InterruptedException {
		Server server = strategy.getServer(servers);

		Log.add("[Selected Server] " + server.getName());

		ResponseMessage responseMessage = Client.sendRequest(requestMessage, server.getUrl());

		if (! activeServers.contains(server)) {
			activeServers.add(server);
		}

		return responseMessage;
	}
}
