package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectEncryptedPassportElement {
	
	private String type;
	private String data;
    private String phone_number;
    private String qfatemail;
}
