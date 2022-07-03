package app.telegram.type;

import app.telegram.object.TelegramMessageObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TelegramMessageType extends TelegramBaseType {
	
	private TelegramMessageObject result;
}
