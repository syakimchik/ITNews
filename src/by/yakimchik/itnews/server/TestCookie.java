package by.yakimchik.itnews.server;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;

public class TestCookie {

	public static String cookie = null;
	
	public static void send() throws IOException, JSONException
	{
		HttpPost httppost = new HttpPost("http://chitki.ru/api/job/test");
		
		httppost.setHeader("Cookie", cookie);
		
		HttpResponse httpResponse = HttpClient.getHttpClient().execute(httppost);
		
		String _responseStr = EntityUtils.toString(httpResponse.getEntity());
		
		int _status = httpResponse.getStatusLine().getStatusCode();
	}
	
}
