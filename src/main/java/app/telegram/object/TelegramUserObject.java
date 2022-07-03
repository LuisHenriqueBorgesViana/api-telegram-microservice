package app.telegram.object;

import lombok.Data;

@Data
public class TelegramUserObject {

	private String id;
	private boolean is_bot;
	private String first_name;
    private String last_name;
    private String username;
    private String language_code;
    private boolean is_premium;
    private boolean added_to_attachment_menu;
    private boolean can_join_groups;
    private boolean can_read_all_group_messages;
    private boolean supports_inline_queries;
}
