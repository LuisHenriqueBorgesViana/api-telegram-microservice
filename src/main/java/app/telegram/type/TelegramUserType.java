package app.telegram.type;

import app.telegram.object.TelegramUserObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TelegramUserType extends TelegramBaseType {
	
	private TelegramUserObject result;
}
