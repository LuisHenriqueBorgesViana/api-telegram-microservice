package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramGameObject {
	
	private String title;
	private String description;
	private ArrayList<TelegramPhotoSizeObject> photo;
	private String text;
	private ArrayList<TelegramMessageEntityObject> text_entities;
	private TelegramAnimationObject animation;
}
