package app.telegram.object;

import lombok.Data;

@Data
public class TelegramInvoiceObject {
	
	private String title;
	private String description;
	private String start_parameter;
	private String currency;
	private int total_amount;
}
