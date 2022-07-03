package app.telegram.object;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TelegramMessageObject {

	private String message_id;
	private TelegramUserObject from;
	private TelegramChatObject sender_chat;
	private int date;
	private TelegramChatObject chat; 
	private TelegramUserObject forward_from;
	private TelegramChatObject forward_from_chat;
	private int forward_from_message_id;
	private String forward_signature;
	private String forward_sender_name;
	private int forward_date;
	private boolean is_automatic_forward;
	private TelegramMessageObject reply_to_message;
	private TelegramUserObject via_bot;
	private int edit_date;
	private boolean has_protected_content;
	private String media_group_id;
	private String author_signature;
	private String text;
	private ArrayList<TelegramMessageEntityObject> entities;
	private TelegramAnimationObject animation;
	private TelegramAudioObject audio;
	private TelegramDocumentObject document;
	private ArrayList<TelegramPhotoSizeObject> photo;
    private TelegramStickerObject sticker;
	private TelegramVideoObject video;
	private TelegramVideoNoteObject video_note;
	private TelegramVoiceObject voice;
	private String caption;
	private ArrayList<TelegramMessageEntityObject> caption_entities;
	private TelegramContactObject contact;
	private TelegramDiceObject dice;
	private TelegramGameObject game;
	private TelegramPollObject poll;
	private TelegramVenueObject venue;
    private TelegramLocationObject location;
	private ArrayList<TelegramUserObject> new_chat_members;
    private TelegramUserObject left_chat_member;
	private String new_chat_title;
	private ArrayList<TelegramPhotoSizeObject> new_chat_photo;
	private boolean delete_chat_photo;
    private boolean group_chat_created;
    private boolean supergroup_chat_created;
    private boolean channel_chat_created;
    private TelegramMessageAutoDeleteTimerChangedObject message_auto_delete_timer_changed;
    private int migrate_to_chat_id;
    private int migrate_from_chat_id;
    private TelegramMessageObject pinned_message;
    private TelegramInvoiceObject invoice;
    private TelegramSuccessfulPaymentObject successful_payment;
    private String connected_website;
    //private  passport_data; // PassportData
    private TelegramProximityAlertTriggeredObject proximity_alert_triggered;
    //private  video_chat_scheduled; // VideoChatScheduled
    //private  video_chat_started; // VideoChatStarted
    //private  video_chat_ended; // VideoChatEnded
    //private  video_chat_participants_invited; // VideoChatParticipantsInvited
    private TelegramWebAppDataObject web_app_data;
    //private  reply_markup; // InlineKeyboardMarkup
}
