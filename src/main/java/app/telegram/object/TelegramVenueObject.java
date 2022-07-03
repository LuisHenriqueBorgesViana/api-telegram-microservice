package app.telegram.object;

import lombok.Data;

@Data
public class TelegramVenueObject {
	
	private TelegramLocationObject location;
    private String title;
    private String address;
    private String foursquare_id;
    private String foursquare_type;
    private String google_place_id;
    private String google_place_type;
}
