package app.telegram.object;

import lombok.Data;

@Data
public class TelegramMessageEntityObject {
	
	private String type;
	private int offset;
	private int length;
	private String url;
	private TelegramUserObject user;
	private String language;
}
