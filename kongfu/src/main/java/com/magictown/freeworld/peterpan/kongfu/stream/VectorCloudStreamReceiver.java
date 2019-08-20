/**
 * @create 2019-08-20 14:33
 * @desc receive springcloud stream middleware
 **/
package com.magictown.freeworld.peterpan.kongfu.stream;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface VectorCloudStreamReceiver {
    @Input("vector-stream-input")
    SubscribableChannel receive();
}

