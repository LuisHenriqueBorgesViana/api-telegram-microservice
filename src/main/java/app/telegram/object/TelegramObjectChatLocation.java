package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectChatLocation {
	
	private TelegramObjectLocation location;
	private String address;
}
