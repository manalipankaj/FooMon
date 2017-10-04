package com.vino.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootToDoApplication.class, args);
	}
}
