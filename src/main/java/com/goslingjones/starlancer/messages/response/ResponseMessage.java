package com.goslingjones.starlancer.messages.response;

public class ResponseMessage {

	private int resultCode;
	private String resultMessage;
	private String responseData;

	public ResponseMessage(int resultCode, String resultMessage, String responseData) {
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
		this.responseData = responseData;
	}

	public int getResultCode() {
		return resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public String getResponseData() {
		return responseData;
	}

}
