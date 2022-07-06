package app.api.controller;

import java.io.IOException;

import app.api.object.SendMessageObject;
import app.telegram.method.TelegramPostMethod;
import app.telegram.object.TelegramResponseObjectSendMessage;

public class ApiSendMessageController {
	
	TelegramPostMethod telegramPost = new TelegramPostMethod();
	
	/**
	 * Send a Text Message.
	 * 
	 * @param sendMessageObject Text Message Object
	 * @throws IOException I/O Error.
	 */
	public TelegramResponseObjectSendMessage sendMessageText(SendMessageObject sendMessageObject) throws IOException {
		
		return telegramPost.sendMessage(sendMessageObject.getConfiguration().getUrlToken(), sendMessageObject.getMessage());
	}
}
