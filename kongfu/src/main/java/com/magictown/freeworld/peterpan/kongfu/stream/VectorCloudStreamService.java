/**
 * @create 2019-08-20 14:45
 * @desc service for stream message
 **/
package com.magictown.freeworld.peterpan.kongfu.stream;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(value = {VectorCloudStreamReceiver.class})
public class VectorCloudStreamService {

    @StreamListener("vector-stream-input")
    public void onMessage(String message) {
        System.out.println(" stream receive message " + message);
    }

}

