package com.goslingjones.starlancer.messages.request;

import com.goslingjones.starlancer.authentication.AuthenticationMethod;

public class RequestMessage {
	
	AuthenticationMethod authenticationMethod;
	RequestMethod requestMethod;
	
	public RequestMessage(AuthenticationMethod authenticationMethod, RequestMethod requestMethod) {
		this.authenticationMethod = authenticationMethod;
		this.requestMethod = requestMethod;
	}
	
	public RequestMethod getRequestMethod() {
		return requestMethod;
	}

}
