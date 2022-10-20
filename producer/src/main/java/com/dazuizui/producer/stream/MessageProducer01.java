package com.dazuizui.producer.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class MessageProducer01 {
    @Autowired
    private Source mySource;

    public void send1(String message){
        mySource.output().send(MessageBuilder.withPayload(message) .setHeader("x-delay", 100 * 1000).build());
    }
}
