package com.example.services.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentServerApplication.class, args);
	}

}
