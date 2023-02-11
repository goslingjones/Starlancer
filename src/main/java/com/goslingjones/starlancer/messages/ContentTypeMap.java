package com.goslingjones.starlancer.messages;

import java.util.HashMap;
import java.util.Map;

public class ContentTypeMap {
	
	public static Map<ContentType, String> contentTypeMap = new HashMap<>(Map.of(
			ContentType.XML, "application/xml",
			ContentType.JSON, "application/json",
			ContentType.Text, "text/plain"
	));

}
