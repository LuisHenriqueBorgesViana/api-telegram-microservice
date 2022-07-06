package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectInvoice {
	
	private String title;
	private String description;
	private String start_parameter;
	private String currency;
	private int total_amount;
}
