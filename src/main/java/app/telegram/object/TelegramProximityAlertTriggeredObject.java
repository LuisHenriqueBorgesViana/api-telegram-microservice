package app.telegram.object;

import lombok.Data;

@Data
public class TelegramProximityAlertTriggeredObject {
	
	private TelegramUserObject traveler;
	private TelegramUserObject watcher;
	private int distance;
}
