/**
 * @create 2019-08-12 16:51
 * @desc receiver
 **/
package com.magictown.freeworld.peterpan.kongfu.message;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(bindings = @QueueBinding(value = @Queue(value = "${vrabbitmq.config.queue.error}",autoDelete = "true"),
//exchange = @Exchange(value = "${vrabbitmq.config.exchange}",type = ExchangeTypes.DIRECT),key = "${vrabbitmq.config.queue.error.routing.key}"))
public class Receiver {

    //@RabbitHandler
    public void process(LogMessage logMessage) {
        System.out.println("vector-cloud-service receive message " + logMessage.toString());
    }

}

