package com.goslingjones.starlancer.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.goslingjones.starlancer.messages.request.RequestMessage;

public class Client {
	
	public static int sendRequest(RequestMessage requestMessage, String url) throws IOException, InterruptedException {
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod(requestMessage.getRequestMethod().toString());
		int responseCode = conn.getResponseCode();
		
		return responseCode;
	}
}
