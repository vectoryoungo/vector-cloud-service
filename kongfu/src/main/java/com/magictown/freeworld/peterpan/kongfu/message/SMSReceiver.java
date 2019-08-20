/**
 * @create 2019-08-13 14:37
 * @desc sms process
 **/
package com.magictown.freeworld.peterpan.kongfu.message;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(
//        bindings = @QueueBinding(value = @Queue(value = "order.sms",autoDelete = "true"),
//                exchange = @Exchange(value ="${vrabbitmq.config.fanout.exchange}",type = ExchangeTypes.FANOUT))
//)
public class SMSReceiver {

    //@RabbitHandler
    public void process(String message) {
        System.out.println("already receive sms message " + message);
    }

}

