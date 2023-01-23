package com.guymanpersonboy.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Specify to Spring to scan for specific modules here.
@ComponentScan({"com.guymanpersonboy.springboot2.model"})
public class Springboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2Application.class, args);
	}

}
