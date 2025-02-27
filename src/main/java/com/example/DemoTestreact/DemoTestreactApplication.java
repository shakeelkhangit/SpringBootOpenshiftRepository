package com.example.DemoTestreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.DemoTestreact")
public class DemoTestreactApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTestreactApplication.class, args);
	}

}
