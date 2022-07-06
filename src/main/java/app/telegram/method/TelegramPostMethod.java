package app.telegram.method;

import java.io.IOException;

import com.google.gson.Gson;

import app.telegram.object.TelegramObjectConfiguration;
import app.telegram.object.TelegramRequestObjectSendMessage;
import app.telegram.object.TelegramResponseObjectSendMessage;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TelegramPostMethod {
	
	TelegramObjectConfiguration telegramConfiguration = new TelegramObjectConfiguration();

	private String separatorUrl = "/";
	private String methodApi    = "POST";	
	
	/**
	 * Use this method to send text messages.
	 * 
	 * @param urlApi Telegram API Full URL.
	 * @param tokenApi Telegram API Access Token.
	 * @param requestBody Request Parameter Body.
	 * @return On success, the sent Message is returned.
	 * @throws IOException I/O Error.
	 */
	public TelegramResponseObjectSendMessage sendMessage(String tokenApi, TelegramRequestObjectSendMessage requestBody) throws IOException {

		String jsonBody     = new Gson().toJson(requestBody);		
	    String methodName   = separatorUrl.concat(Thread.currentThread().getStackTrace()[1].getMethodName());
	    String endpointName = telegramConfiguration.getUrlApi().concat(tokenApi).concat(methodName);
	    
		OkHttpClient clientOkHttp = new OkHttpClient()
		.newBuilder()
		.build();
		
		MediaType mediaType = MediaType
		.parse("application/json");
				
	    RequestBody bodyRequest = RequestBody
	    .Companion
	    .create(jsonBody, mediaType);

		Request requestOkHttp = new Request
		.Builder()
		.url(endpointName)
		.method(methodApi, bodyRequest)
		.build();
				
		Response responseOkHttp = clientOkHttp
		.newCall(requestOkHttp)
		.execute();
		
		return new Gson().fromJson(responseOkHttp.body().string(), TelegramResponseObjectSendMessage.class);
	}
}
