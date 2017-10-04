package com.vino.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vinodini on 4/10/17.
 */

@RequestMapping("/api")
@RestController
public class AboutController {

    @GetMapping("/about")
    public String get() {
        return "1.0";
    }
}
