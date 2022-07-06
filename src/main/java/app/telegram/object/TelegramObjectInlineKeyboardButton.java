package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectInlineKeyboardButton {
	
	private String text;
	private String url;
	private String callback_data;
	private TelegramObjectWebAppData web_app;
	private TelegramObjectLoginUrl login_url;
	private String switch_inline_query;
	private String switch_inline_query_current_chat;
	private TelegramObjectCallbackGame callback_game;
	private boolean pay;
}
