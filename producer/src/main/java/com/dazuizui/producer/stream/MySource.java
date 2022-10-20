package com.dazuizui.producer.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface MySource {
    String OUTPUT1 = "my_output";

    @Output(OUTPUT1)
    MessageChannel channel();
}
