package app.telegram.object;

import lombok.Data;

@Data
public class TelegramResponseObject {
	
	private String ok;
	private int error_code;
	private String description;
}
