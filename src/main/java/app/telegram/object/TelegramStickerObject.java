package app.telegram.object;

import lombok.Data;

@Data
public class TelegramStickerObject {
	
	private String file_id;
	private String file_unique_id;
	private int width;
	private int height;
	private boolean is_animated;
	private boolean is_video;
	private TelegramPhotoSizeObject thumb;
	private String emoji;
	private String set_name;
	private TelegramFileObject premium_animation;
	private TelegramMaskPositionObject mask_position;
	private int file_size;
}
