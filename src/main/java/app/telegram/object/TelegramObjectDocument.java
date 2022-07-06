package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectDocument {
	
	private String file_id;
	private String file_unique_id;
    private TelegramObjectPhotoSize thumb;
	private String file_name;
	private String mime_type;
	private int file_size;
}
