package com.anma.sb.bsockets.contr;

import com.anma.sb.bsockets.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.time.LocalDateTime;

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public Message greet(Message message) {
        HtmlUtils.htmlEscape("<html></html>");
        Message msg = new Message("Hello there!", LocalDateTime.now());
        return msg;
    }
}
