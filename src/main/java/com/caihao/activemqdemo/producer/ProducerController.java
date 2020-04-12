package com.caihao.activemqdemo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * create by caihao on 2020/4/12
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    @GetMapping("/sendQueue")
    public String sendQueue() {
        jmsMessagingTemplate.convertAndSend(queue,"hello one");
        return "send success";
    }

    @GetMapping("/sendTopic")
    public String sendTopic(){
        jmsMessagingTemplate.convertAndSend(topic,"hello n");
        return "send success";
    }

}
