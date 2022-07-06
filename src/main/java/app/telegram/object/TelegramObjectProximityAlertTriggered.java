package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectProximityAlertTriggered {
	
	private TelegramObjectUser traveler;
	private TelegramObjectUser watcher;
	private int distance;
}
