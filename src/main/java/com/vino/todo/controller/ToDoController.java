package com.vino.todo.controller;

import java.util.HashMap;

import clover.com.google.gson.Gson;
import clover.com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vinodini on 4/10/17.
 */

@RequestMapping("/api/to-do")
@RestController
public class ToDoController {

    @GetMapping
    public String get() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"meet A");
        map.put(2,"buy C");

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        return gson.toJson(map);
    }

}
