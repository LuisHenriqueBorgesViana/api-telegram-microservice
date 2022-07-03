package app.telegram.method;

import java.io.IOException;

import com.google.gson.Gson;

import app.telegram.type.TelegramUserType;

import lombok.Data;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Data
public class TelegramGetMethods {

	private String separatorUrl = "/";
	private String methodApi    = "GET";
	
	/**
	 * A simple method for testing your bot's authentication token. 
	 * 
	 * @param urlApi Telegram API Full URL.
	 * @param tokenApi Telegram API Access Token.
	 * @return Returns basic information about the bot in form of a User object.
	 * @throws IOException I/O Error.
	 */
	public TelegramUserType getMe(String urlApi, String tokenApi) throws IOException {

	    String methodName  = separatorUrl.concat(Thread.currentThread().getStackTrace()[1].getMethodName());		
	    String endpointApi = urlApi.concat(tokenApi).concat(methodName);

		OkHttpClient clientOkHttp = new OkHttpClient()
		.newBuilder()
		.build();

		Request requestOkHttp = new Request
		.Builder()
		.url(endpointApi)
		.method(methodApi, null)
		.build();
				
		Response responseOkHttp = clientOkHttp
		.newCall(requestOkHttp)
		.execute();

		return new Gson().fromJson(responseOkHttp.body().string(), TelegramUserType.class);
	}
}
