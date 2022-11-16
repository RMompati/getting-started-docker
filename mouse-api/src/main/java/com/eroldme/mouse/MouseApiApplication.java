package com.eroldme.mouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MouseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MouseApiApplication.class, args);
	}

}
