package com.goslingjones.starlancer.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.goslingjones.starlancer.messages.ContentTypeMap;
import com.goslingjones.starlancer.messages.request.RequestMessage;
import com.goslingjones.starlancer.messages.request.RequestMethod;
import com.goslingjones.starlancer.messages.response.ResponseMessage;

public class Client {
	
	public static ResponseMessage sendRequest(RequestMessage requestMessage, String url) throws IOException, InterruptedException {
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		conn.setRequestMethod(requestMessage.getRequestMethod().toString());
		conn.setRequestProperty("Accept", "*/*");

		if (requestMessage.getRequestMethod().equals(RequestMethod.POST)) {

			conn.setRequestProperty("Content-Type", ContentTypeMap.contentTypeMap.get(requestMessage.getRequestHeader().getContentType()));

			conn.setDoOutput(true);

			String data = requestMessage.getRequestBody().getData();
			conn.getOutputStream().write(data.getBytes());
		}

		int resultCode = conn.getResponseCode();
		String resultMessage = conn.getResponseMessage();
		
		String responseData = null;
		if (resultCode == 200 || resultCode == 201) {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			StringBuilder response = new StringBuilder();
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				response.append(line.trim());
			}

			responseData = response.toString();
		}

		conn.disconnect();

		return new ResponseMessage(resultCode, resultMessage, responseData);
	}
}
