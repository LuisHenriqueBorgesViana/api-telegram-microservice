package app;

import java.io.IOException;

import app.telegram.method.TelegramGetMethods;
import app.telegram.method.TelegramPostMethods;
import app.telegram.object.TelegramSendMessageObject;
import app.telegram.object.TelegramUserObject;
import app.telegram.type.TelegramMessageType;
import app.telegram.type.TelegramUserType;

public class TestsApplication {

	public static void main(String[] args) throws IOException {
	
		/** Keys **/
		String urlApi     = "https://api.telegram.org/bot";
		String tokenAcess = "5500339396:AAGdYYgduxENIAK1fTowhr64wFOdsC8VNtw";
		
		/** Methods **/
		TelegramGetMethods  methodsGet  = new TelegramGetMethods();
		TelegramPostMethods methodsPost = new TelegramPostMethods(); 
		
		/** Types **/		
		TelegramUserType    userType    = new TelegramUserType();
		TelegramMessageType messageType = new TelegramMessageType();
		
		/*** Params ***/
		
		// 1. sendMessage
		TelegramSendMessageObject sendMessageParam = new TelegramSendMessageObject();
		sendMessageParam.setChat_id("-739259266");
		sendMessageParam.setText("Test Send Message");
      	
		/*** Tests ***/
		
        // 1. Endpoint [getMe]
		//userType = methodsGet.getMe(urlApi, tokenAcess);		
		//System.out.println("id: " + userType.getResult().getId());
		//System.out.println("is_boot: " + userType.getResult().is_bot());	
		//System.out.println("username: " + userType.getResult().getUsername());
		
        // 2. Endpoint [sendMessage]
		messageType = methodsPost.sendMessage(urlApi, tokenAcess, sendMessageParam); 
		messageType.getResult().getMessage_id();
	}
}
