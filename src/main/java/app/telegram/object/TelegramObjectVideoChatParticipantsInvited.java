package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramObjectVideoChatParticipantsInvited {
	
	private ArrayList<TelegramObjectUser> users;
}
