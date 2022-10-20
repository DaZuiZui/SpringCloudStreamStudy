package com.dazuizui.producer.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(MySource.class)
public class MessageProducer {
    @Autowired
    private MySource mySource;

    public void send1(String message){
        mySource.channel().send(MessageBuilder.withPayload(message).build());
    }
}
