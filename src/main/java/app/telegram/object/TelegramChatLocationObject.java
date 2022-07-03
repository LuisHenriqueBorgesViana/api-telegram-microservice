package app.telegram.object;

import lombok.Data;

@Data
public class TelegramChatLocationObject {
	
	private TelegramLocationObject location;
	private String address;
}
