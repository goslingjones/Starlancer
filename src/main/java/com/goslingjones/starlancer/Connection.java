package com.goslingjones.starlancer;

import com.goslingjones.starlancer.authentication.AuthenticationMethod;

public class Connection {
	
	private AuthenticationMethod authenticationMethod;
	
	public Connection(AuthenticationMethod authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}
}
