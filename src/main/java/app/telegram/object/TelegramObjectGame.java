package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramObjectGame {
	
	private String title;
	private String description;
	private ArrayList<TelegramObjectPhotoSize> photo;
	private String text;
	private ArrayList<TelegramObjectMessageEntity> text_entities;
	private TelegramObjectAnimation animation;
}
