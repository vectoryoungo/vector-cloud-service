/**
 * @create 2019-08-02 17:06
 * @desc provide kong fu
 **/
package com.magictown.freeworld.peterpan.kongfu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KongFuProviderController {

    @GetMapping(value = "/getKongFu")
    public String getKongFu() {

        return "BeatDragon";
    }

    @GetMapping(value = "/getSkill")
    public List<String> getSkill() {

        List<String> arrayList = new ArrayList<>(16);
        arrayList.add("Swtter skill");
        arrayList.add("Long Leg skill");
        arrayList.add("Super voice skill");
        arrayList.add("Penta kill skill");

        return arrayList;
    }

    @GetMapping(value = "/getTeacher")
    public List<String> getTeacher() {
        List<String> teacherList = new ArrayList<>();
        teacherList.add("Master wugui");
        teacherList.add("Master Tiger");
        teacherList.add("Master Monkey");
        teacherList.add("Master Pig");

        return teacherList;
    }
}

