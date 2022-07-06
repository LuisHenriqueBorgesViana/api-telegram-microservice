package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectVoice {
	
	private String file_id;
	private String file_unique_id;
	private int duration;
	private String mime_type;
	private int file_size;
}
