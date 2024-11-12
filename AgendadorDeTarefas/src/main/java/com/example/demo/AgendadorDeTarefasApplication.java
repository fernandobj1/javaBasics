package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AgendadorDeTarefasApplication {

	//Prints out the current time every five seconds by using Spring Framework’s @Scheduled annotation.


	public static void main(String[] args) {
		SpringApplication.run(AgendadorDeTarefasApplication.class, args);
	}

}
