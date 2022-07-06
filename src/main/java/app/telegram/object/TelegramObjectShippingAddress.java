package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectShippingAddress {
	
	private String country_code;
	private String state;
	private String city;
	private String street_line1;
	private String street_line2;
	private String post_code;
}
