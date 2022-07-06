package app.telegram.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TelegramResponseObjectSendMessage extends TelegramResponseObject {
	
	private TelegramObjectMessage result;
}
