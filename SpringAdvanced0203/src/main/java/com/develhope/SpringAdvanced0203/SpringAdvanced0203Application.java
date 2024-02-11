package com.develhope.SpringAdvanced0203;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdvanced0203Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdvanced0203Application.class, args);
	}

}


/*
	create a Spring Boot application using Spring Initializr that has the following dependencies:
		Lombok
		Spring Boot DevTools
		Spring Web
		define an application.yaml config file where you set:
		a property called authCode with the value xyz458
		a property called devName with your name as a value
		using Spring Boot on port 4500, return a greeting message showing the devName and the authCode using the getProperty method
*/
