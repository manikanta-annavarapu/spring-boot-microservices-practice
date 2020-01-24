package com.practice.ratingManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RatingManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingManagementSystemApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemple(){
		return	new RestTemplate();
	}

}
