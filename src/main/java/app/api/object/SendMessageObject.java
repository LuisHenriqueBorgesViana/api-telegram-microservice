package app.api.object;

import app.telegram.object.TelegramRequestObjectSendMessage;

import lombok.Data;

@Data
public class SendMessageObject {
	
	ConfigurationObject configuration;
	TelegramRequestObjectSendMessage message;
}
