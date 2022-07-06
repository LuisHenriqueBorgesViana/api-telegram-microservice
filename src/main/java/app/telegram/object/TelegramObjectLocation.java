package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectLocation {
	
	private float longitude;
	private float latitude;
    private float horizontal_accuracy;
    private int live_period;
    private int heading;
    private int proximity_alert_radius;
}
