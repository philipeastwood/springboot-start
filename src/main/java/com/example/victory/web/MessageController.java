package com.example.victory.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping(value = "/getMessage")
    public String getMessage() {
        return "Hello world";
    }
}
