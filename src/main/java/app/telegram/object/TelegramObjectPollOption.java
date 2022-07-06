package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectPollOption {
	
	private String text;
	private int voter_count;
}
