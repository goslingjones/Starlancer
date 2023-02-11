package com.goslingjones.starlancer.messages.request;

import com.goslingjones.starlancer.authentication.AuthenticationMethod;
import com.goslingjones.starlancer.messages.ContentType;

public class RequestHeader {
	
	private AuthenticationMethod authenticationMethod;
	private ContentType contentType;
	private RequestMethod requestMethod;
	
	public RequestHeader(AuthenticationMethod authenticationMethod, ContentType contentType, RequestMethod requestMethod) {
		this.authenticationMethod = authenticationMethod;
		this.contentType = contentType;
		this.requestMethod = requestMethod;
	}
	
	public ContentType getContentType() {
		return contentType;
	}
	
	public RequestMethod getRequestMethod() {
		return requestMethod;
	}
	
	public AuthenticationMethod getAuthenticationMethod() {
		return authenticationMethod;
	}

}
