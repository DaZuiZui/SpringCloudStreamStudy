package com.dazuizui.consumer.stream;

import com.dazuizui.consumer.channel.MySink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(MySink.class)
public class MessageConsumer1 {
    @StreamListener(MySink.MYINPUT)
    public void receive(String message) throws InterruptedException {

        System.out.println(message);
    }
}
