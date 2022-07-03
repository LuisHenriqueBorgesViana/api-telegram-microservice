package app.telegram.object;

import lombok.Data;

@Data
public class TelegramAudioObject {
	
	private String file_id;
	private String file_unique_id;
	private int duration; 
	private String performer;
	private String title;
	private String file_name;
	private String mime_type;
	private int file_size;
	private TelegramPhotoSizeObject thumb;
}
