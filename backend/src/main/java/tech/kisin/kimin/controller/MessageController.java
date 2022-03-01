package tech.kisin.kimin.controller;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.kisin.kimin.dto.MessageDTO;
import tech.kisin.kimin.dto.Result;
import tech.kisin.kimin.entity.Message;

@RestController
public class MessageController {
    private SimpMessagingTemplate template;

    public MessageController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @PostMapping("/send")
    public Result<Boolean> send(@RequestBody MessageDTO messageDTO) {
        Message message = Message.Factory.create(
                messageDTO.getSenderAccountNumber(),
                messageDTO.getReceiverAccountNumber(),
                messageDTO.getType(),
                messageDTO.getContent()
        );
        // todo save the message
        template.convertAndSend("/receive/123456", message);
        return new Result<>(Result.Code.SUCCESS, true);
    }
}
