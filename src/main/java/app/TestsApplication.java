package app;

import java.io.IOException;

import app.telegram.method.TelegramGetMethod;
import app.telegram.method.TelegramPostMethod;
import app.telegram.object.TelegramRequestObjectSendMessage;
import app.telegram.object.TelegramResponseObjectSendMessage;
import app.telegram.object.TelegramResponseObjectUser;
import app.telegram.object.TelegramObjectUser;

public class TestsApplication {

	public static void main(String[] args) throws IOException {
	
		/** Keys **/
		String urlApi     = "https://api.telegram.org/bot";
		String tokenAcess = "5500339396:AAGdYYgduxENIAK1fTowhr64wFOdsC8VNtw";
		
		/** Methods **/
		TelegramGetMethod  methodsGet  = new TelegramGetMethod();
		TelegramPostMethod methodsPost = new TelegramPostMethod(); 
		
		/** Types **/		
		TelegramResponseObjectUser    userType    = new TelegramResponseObjectUser();
		TelegramResponseObjectSendMessage messageType = new TelegramResponseObjectSendMessage();
		
		/*** Params ***/
		
		// 1. sendMessage
		TelegramRequestObjectSendMessage sendMessageParam = new TelegramRequestObjectSendMessage();
		sendMessageParam.setChat_id("-739259266");
		sendMessageParam.setText("Test Send Message");
      	
		/*** Tests ***/
		
        // 1. Endpoint [getMe]
		//userType = methodsGet.getMe(urlApi, tokenAcess);		
		//System.out.println("id: " + userType.getResult().getId());
		//System.out.println("is_boot: " + userType.getResult().is_bot());	
		//System.out.println("username: " + userType.getResult().getUsername());
		
        // 2. Endpoint [sendMessage]
		//messageType = methodsPost.sendMessage(urlApi, tokenAcess, sendMessageParam); 
		//messageType.getResult().getMessage_id();
	}
}
