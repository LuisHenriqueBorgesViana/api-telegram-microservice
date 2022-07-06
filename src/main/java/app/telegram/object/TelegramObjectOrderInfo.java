package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectOrderInfo {
	
	private String name;
	private String phone_number;
	private String email;
	private TelegramObjectShippingAddress shipping_address;
}
