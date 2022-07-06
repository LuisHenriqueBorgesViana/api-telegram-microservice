package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectVideoNote {
	
	private String file_id;
	private String file_unique_id;
	private int length;
	private int duration;
	private TelegramObjectPhotoSize thumb;
	private int file_size;
}
