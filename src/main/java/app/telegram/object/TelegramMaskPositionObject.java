package app.telegram.object;

import lombok.Data;

@Data
public class TelegramMaskPositionObject {
	
	private String point;
	private float x_shift;
	private float y_shift;
	private float scale;
}
