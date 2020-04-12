package com.caihao.activemqdemo.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * 生产者配置
 * create by caihao on 2020/4/12
 */
@Configuration
public class ActiveMQConfig {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("queue1-1");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("topic1-n");
    }
}
