package app.telegram.object;

import lombok.Data;

@Data
public class TelegramSuccessfulPaymentObject {
	
	private String currency;
	private int total_amount;
	private String invoice_payload;
	private String shipping_option_id;
	private TelegramOrderInfoObject order_info;
	private String telegram_payment_charge_id;
	private String provider_payment_charge_id;

}
