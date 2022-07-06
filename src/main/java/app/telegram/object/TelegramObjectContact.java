package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectContact {
	
	private String phone_number;
	private String first_name;
	private String last_name;
	private int user_id;
	private String vcard;
}
