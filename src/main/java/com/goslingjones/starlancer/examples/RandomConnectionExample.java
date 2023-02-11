package com.goslingjones.starlancer.examples;

import java.io.IOException;

import com.goslingjones.starlancer.Balancer;
import com.goslingjones.starlancer.Server;
import com.goslingjones.starlancer.authentication.UsernameAndPassword;
import com.goslingjones.starlancer.messages.request.RequestMessage;
import com.goslingjones.starlancer.messages.request.RequestMethod;
import com.goslingjones.starlancer.strategy.RandomStrategy;

public class RandomConnectionExample {
	
	static Server[] servers = {
			new Server("<SERVER_NAME>", "<URL>"),
			new Server("<SERVER_NAME>", "<URL>"),
			new Server("<SERVER_NAME>", "<URL>")
	};
	
	static int numberOfMessages = 10;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		/* Create a Random Strategy Balancer */
		Balancer balancer = new Balancer(new RandomStrategy(), servers);
		
		/* Create a default request message using username and password */
		RequestMessage requestMessage = new RequestMessage(new UsernameAndPassword("default-user", "default-password"), RequestMethod.GET);
		
		/* Send a couple of requests through the balancer */
		for (int i = 0; i < numberOfMessages; i++) {
			balancer.sendRequest(requestMessage);
		}
	}

}
