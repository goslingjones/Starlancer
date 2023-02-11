package com.goslingjones.starlancer.messages.request;

public class RequestMessage {

	RequestHeader requestHeader;
	RequestBody requestBody;
	
	public RequestMessage(RequestHeader requestHeader, RequestBody requestBody) {
		this.requestHeader = requestHeader;
		this.requestBody = requestBody;
	}
	
	public RequestMethod getRequestMethod() {
		return this.requestHeader.getRequestMethod();
	}

	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	public RequestBody getRequestBody() {
		return requestBody;
	}

}
