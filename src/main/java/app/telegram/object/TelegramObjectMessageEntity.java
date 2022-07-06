package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectMessageEntity {
	
	private String type;
	private int offset;
	private int length;
	private String url;
	private TelegramObjectUser user;
	private String language;
}
