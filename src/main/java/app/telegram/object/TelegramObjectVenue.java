package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectVenue {
	
	private TelegramObjectLocation location;
    private String title;
    private String address;
    private String foursquare_id;
    private String foursquare_type;
    private String google_place_id;
    private String google_place_type;
}
