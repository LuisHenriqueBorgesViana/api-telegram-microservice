package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramObjectMessage {

	private String message_id;
	private TelegramObjectUser from;
	private TelegramObjectChat sender_chat;
	private int date;
	private TelegramObjectChat chat; 
	private TelegramObjectUser forward_from;
	private TelegramObjectChat forward_from_chat;
	private int forward_from_message_id;
	private String forward_signature;
	private String forward_sender_name;
	private int forward_date;
	private boolean is_automatic_forward;
	private TelegramObjectMessage reply_to_message;
	private TelegramObjectUser via_bot;
	private int edit_date;
	private boolean has_protected_content;
	private String media_group_id;
	private String author_signature;
	private String text;
	private ArrayList<TelegramObjectMessageEntity> entities;
	private TelegramObjectAnimation animation;
	private TelegramObjectAudio audio;
	private TelegramObjectDocument document;
	private ArrayList<TelegramObjectPhotoSize> photo;
    private TelegramObjectSticker sticker;
	private TelegramObjectVideo video;
	private TelegramObjectVideoNote video_note;
	private TelegramObjectVoice voice;
	private String caption;
	private ArrayList<TelegramObjectMessageEntity> caption_entities;
	private TelegramObjectContact contact;
	private TelegramObjectDice dice;
	private TelegramObjectGame game;
	private TelegramObjectPoll poll;
	private TelegramObjectVenue venue;
    private TelegramObjectLocation location;
	private ArrayList<TelegramObjectUser> new_chat_members;
    private TelegramObjectUser left_chat_member;
	private String new_chat_title;
	private ArrayList<TelegramObjectPhotoSize> new_chat_photo;
	private boolean delete_chat_photo;
    private boolean group_chat_created;
    private boolean supergroup_chat_created;
    private boolean channel_chat_created;
    private TelegramObjectMessageAutoDeleteTimerChanged message_auto_delete_timer_changed;
    private int migrate_to_chat_id;
    private int migrate_from_chat_id;
    private TelegramObjectMessage pinned_message;
    private TelegramObjectInvoice invoice;
    private TelegramObjectSuccessfulPayment successful_payment;
    private String connected_website;
    private TelegramObjectPassportData passport_data;
    private TelegramObjectProximityAlertTriggered proximity_alert_triggered;
    private TelegramObjectVideoChatScheduled video_chat_scheduled;
    private TelegramObjectVideoChatStarted video_chat_started;
    private TelegramObjectVideoChatEnded video_chat_ended;
    private TelegramObjectVideoChatParticipantsInvited video_chat_participants_invited;
    private TelegramObjectWebAppData web_app_data;
    private TelegramObjectInlineKeyboardButton reply_markup;
}
