/**
 * @create 2019-08-13 11:30
 * @desc
 **/
package com.magictown.freeworld.peterpan.kongfu.message;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(value = @Queue(value = "${vrabbitmq.config.queue.str.error}",autoDelete = "true"),
        exchange = @Exchange(value = "${vrabbitmq.config.strexchange}",type = ExchangeTypes.TOPIC),key = "*.log.*"))
public class ReceiverJson {

    @RabbitHandler
    public void process(String message) {
        System.out.println("receiver String message " + message);
    }
}

