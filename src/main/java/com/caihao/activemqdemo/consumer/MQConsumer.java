package com.caihao.activemqdemo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * create by caihao on 2020/4/12
 */
@Service
@Slf4j
public class MQConsumer {

    @JmsListener(destination = "queue1-1", containerFactory = "queueJmsListener")
    public void queue(String msg) {
        log.info("received msg:{}", msg);
    }

    @JmsListener(destination = "topic1-n", containerFactory = "topicJmsListener")
    public void topic(String msg) {
        log.info("received msg:{}", msg);
    }
}
