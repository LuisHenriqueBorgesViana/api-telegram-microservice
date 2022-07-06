package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectFile {
	
	private String file_id;
	private String file_unique_id;
    private int file_size;
    private String file_path;
} 
