package app.telegram.object;

import lombok.Data;

@Data
public class TelegramSendMessageObject {
	
	private String chat_id;
	private String text;	
}
