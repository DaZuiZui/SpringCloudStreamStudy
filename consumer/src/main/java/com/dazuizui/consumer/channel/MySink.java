package com.dazuizui.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
    String MYINPUT = "MYINPUT";
    @Input(MYINPUT)
    SubscribableChannel input();
}
