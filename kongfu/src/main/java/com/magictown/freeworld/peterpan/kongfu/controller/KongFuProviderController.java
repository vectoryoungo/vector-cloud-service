/**
 * @create 2019-08-02 17:06
 * @desc provide kong fu
 **/
package com.magictown.freeworld.peterpan.kongfu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KongFuProviderController {

    @GetMapping(value = "/getKongFu")
    public String getKongFu() {

        return "BeatDragon";
    }
}

