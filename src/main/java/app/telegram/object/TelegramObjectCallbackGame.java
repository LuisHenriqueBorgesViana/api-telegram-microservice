package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectCallbackGame {
	
	private int user_id;
	private int score;
	private boolean force;
	private boolean disable_edit_message;
	private int chat_id;
	private int message_id;
    private String inline_message_id;
}
