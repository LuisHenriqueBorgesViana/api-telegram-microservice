package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectPhotoSize {
	
	private String file_id;
	private String file_unique_id;
	private String width;
	private String height;
	private String file_size;
}
