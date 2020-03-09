package com.example.victory.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

//    @Value("serverPort")
//    public String port ;

    @Value("${some.message}")
    public String message ;

    @RequestMapping(value = "/getMessage")
    public String getMessage() {
        return "some message:" + message;
    }
}
