package com.goslingjones.starlancer.authentication;

public class UsernameAndPassword implements AuthenticationMethod {
	
	private String username;
	private String password;
	
	public UsernameAndPassword(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
