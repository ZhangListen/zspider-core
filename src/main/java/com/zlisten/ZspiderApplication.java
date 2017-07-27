package com.zlisten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zlisten.controller")
public class ZspiderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZspiderApplication.class, args);
	}
}
