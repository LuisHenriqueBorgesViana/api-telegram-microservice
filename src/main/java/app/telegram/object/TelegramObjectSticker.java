package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectSticker {
	
	private String file_id;
	private String file_unique_id;
	private int width;
	private int height;
	private boolean is_animated;
	private boolean is_video;
	private TelegramObjectPhotoSize thumb;
	private String emoji;
	private String set_name;
	private TelegramObjectFile premium_animation;
	private TelegramObjectMaskPosition mask_position;
	private int file_size;
}
