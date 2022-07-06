package app.telegram.object;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

@Data
@ApiModel
public class TelegramRequestObjectSendMessage {
	
	@JsonProperty("chat_id")
	@ApiModelProperty(notes = "Chat ID", name = "Chat ID", required = true, value = "Unique identifier for the target chat or username of the target channel (Unique identifier for the target chat or username of the target channel (in the format @channelusername).", example= "-739259261", position = 1)	
	private String chat_id;
	
	@JsonProperty("text")
	@ApiModelProperty(notes = "Text Message", name = "Text Message", required = true, value = "Text of the message to be sent, 1-4096 characters after entities parsing.", example = "Test Sending Message de Texto", position = 2)	
	private String text;	
	
	@JsonProperty("parse_mode")
	@ApiModelProperty(notes = "Analysis Mode", name = "Analysis Mode", required = false, value = "Mode for parsing entities in the message text. See formatting options for more details.", example = "https://core.telegram.org/bots/api#formatting-options", position = 3)		
	private String parse_mode;
	
	@JsonProperty("entities")
	@ApiModelProperty(notes = "Message Entity", name = "Message Entity", required = false, value = "A JSON-serialized list of special entities that appear in message text, which can be specified instead of parse_mode.", example = "Array of MessageEntity", position = 4)		
	private ArrayList<TelegramObjectMessageEntity> entities;
	
	@JsonProperty("disable_web_page_preview")
	@ApiModelProperty(notes = "Disable Web Page Preview", name = "Disable Web Page Preview", required = false, value = "Disables link previews for links in this message.", example = "true", position = 5)			
	private boolean disable_web_page_preview;
	
	@JsonProperty("disable_notification")
	@ApiModelProperty(notes = "Disable Notification", name = "Disable Notification", required = false, value = "Sends the message silently. Users will receive a notification with no sound.", example = "false", position = 6)			
	private boolean disable_notification;
	
	@JsonProperty("protect_content")
	@ApiModelProperty(notes = "Protect Content", name = "Protect Content", required = false, value = "Protects the contents of the sent message from forwarding and saving.", example = "false", position = 7)				
	private boolean protect_content;
	
	@JsonProperty("reply_to_message_id")
	@ApiModelProperty(notes = "Reply to Message ID", name = "Reply to Message ID", required = false, value = "If the message is a reply, ID of the original message.", example = "-1878586", position = 8)				
	private String reply_to_message_id;
	
	@JsonProperty("allow_sending_without_reply")
	@ApiModelProperty(notes = "Allow Sending without Reply", name = "Allow Sending without Reply", required = false, value = "Pass True, if the message should be sent even if the specified replied-to message is not found.", example = "false", position = 9)				
	private boolean allow_sending_without_reply;
	
	@JsonProperty("reply_markup")
	@ApiModelProperty(notes = "Allow Sending without Reply", name = "Allow Sending without Reply", required = false, value = "Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.", example = "InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply", position = 10)					
	private String reply_markup;
}
