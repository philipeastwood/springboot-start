package com.example.victory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VictoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VictoryApplication.class, args);
        System.out.printf("111");
	}

}
