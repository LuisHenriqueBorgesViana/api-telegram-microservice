package app.telegram.object;

import lombok.Data;

@Data
public class TelegramOrderInfoObject {
	
	private String name;
	private String phone_number;
	private String email;
	private TelegramShippingAddressObject shipping_address;
}
