package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectVideo {

	private String file_id;
	private String file_unique_id;
	private int width;
	private int height;
	private int duration;
	private TelegramObjectPhotoSize thumb;
	private String file_name;
	private String mime_type;
	private int file_size;
}
