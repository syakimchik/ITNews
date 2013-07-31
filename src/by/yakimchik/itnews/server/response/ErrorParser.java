package by.yakimchik.itnews.server.response;

import org.json.JSONException;
import org.json.JSONObject;

public class ErrorParser {
	
	private static final String TAG_ERROR = "error";

	public static String parse(String response) throws JSONException
	{		
		JSONObject object = new JSONObject(response);
		
		String out = object.getString(TAG_ERROR);
		
		return out;
	}
	
}
