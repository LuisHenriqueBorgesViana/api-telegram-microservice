package app.api.service;

import java.io.IOException;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.api.controller.ApiSendMessageController;

import app.api.object.SendMessageObject;

import app.telegram.object.TelegramResponseObjectSendMessage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/message/send")
@Api(value = "Send Message", tags = "Send Message")
public class SendMessageService {
	
	ApiSendMessageController sendMessageController = new ApiSendMessageController();
	
	@PostMapping(value = "/text", produces = "application/json")
	@ApiOperation(value = "Send a Text Message to a Chat.", response = TelegramResponseObjectSendMessage.class, tags = "Send Message")	
	public TelegramResponseObjectSendMessage sendTextMessage(@NonNull @RequestBody SendMessageObject sendMessageObject) throws IOException {
				
		return sendMessageController.sendMessageText(sendMessageObject);
	}
}
