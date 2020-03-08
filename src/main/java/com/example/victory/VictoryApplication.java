package com.example.victory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VictoryApplication {

    @Value("serverPort")
    private static String port ;

    public static void main(String[] args) {
        SpringApplication.run(VictoryApplication.class, args);
        System.out.println("Port:" + port);
    }

}
