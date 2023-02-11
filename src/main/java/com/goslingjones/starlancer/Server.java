package com.goslingjones.starlancer;

import java.util.ArrayList;
import java.util.List;

public class Server {
	
	private String name;
	private String host;
	private int httpsPort;
	private List<Connection> connections = new ArrayList<>();
	
	public Server(String name, String host, int httpsPort) {
		this.name = name;
		this.host = host;
		this.httpsPort = httpsPort;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHost() {
		return host;
	}
	
	public int getHttpsPort() {
		return httpsPort;
	}
	
	public List<Connection> getConnections() {
		return connections;
	}
	
	/**
	 * Opens a connection to the server
	 * 
	 * @param connection
	 */
	public void openConnection(Connection connection) {
		connections.add(connection);
	}
	
	/**
	 * Closes an existent connection in the server
	 * 
	 * @param connection
	 */
	public void closeConnection(Connection connection) {
		connections.remove(connection);
	}

}
