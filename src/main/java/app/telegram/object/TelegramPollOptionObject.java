package app.telegram.object;

import lombok.Data;

@Data
public class TelegramPollOptionObject {
	
	private String text;
	private int voter_count;
}
