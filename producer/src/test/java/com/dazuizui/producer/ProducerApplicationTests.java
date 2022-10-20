package com.dazuizui.producer;

import com.dazuizui.producer.stream.MessageProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProducerApplicationTests {

    @Autowired
    private MessageProducer messageProducer;

    @Test
    void contextLoads() {
        for (int i = 0; i <1 ; i++) {
            messageProducer.send1("Hello Dazui");
            System.out.println("ok");
        }


    }

}
