package app.telegram.object;

import lombok.Data;

@Data
public class TelegramChatPhotoObject {

	private String small_file_id;
	private String small_file_unique_id;
	private String big_file_id;
	private String big_file_unique_id;
}
