package com.goslingjones.starlancer;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	private String name;
	private String url;
	private List<Connection> connections = new ArrayList<>();
	
	public Server(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public List<Connection> getConnections() {
		return connections;
	}

}
