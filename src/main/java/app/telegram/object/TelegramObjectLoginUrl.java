package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectLoginUrl {
	
	private String url;
	private String forward_text;
	private String bot_username;
	private boolean request_write_access;
}
