package app.telegram.object;

import lombok.Data;

@Data
public class TelegramObjectChat {
	
	private String id;
	private String type;
	private String title;
	private String username;
	private String first_name;
	private String last_name;
	private TelegramObjectChatPhoto photo;
	private String bio;
	private boolean has_private_forwards;
	private boolean join_to_send_messages;
	private boolean join_by_request;
	private String description;
	private String invite_link;
	private TelegramObjectMessage pinned_message;
	private TelegramObjectChatPermissions permissions;
	private int slow_mode_delay;
	private int message_auto_delete_time;
	private boolean has_protected_content;
	private String sticker_set_name;
	private boolean can_set_sticker_set;
	private String linked_chat_id;
	private TelegramObjectChatLocation location;
}
