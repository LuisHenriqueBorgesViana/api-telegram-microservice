package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectChatPermissions {
	
	private boolean can_send_messages;
	private boolean can_send_media_messages;
	private boolean can_send_polls;
	private boolean can_send_other_messages;
	private boolean can_add_web_page_previews;
	private boolean can_change_info;
	private boolean can_invite_users;
	private boolean can_pin_messages;
}
