package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramObjectPassportData {

	private ArrayList<TelegramObjectEncryptedPassportElement> data;
	private TelegramObjectEncryptedCredentials credentials;
}
