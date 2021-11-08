package com.santicodev.springessentialtraining;

import com.santicodev.springessentialtraining.runners.FizzBuzzRunner;
import com.santicodev.springessentialtraining.runners.GetRoomsRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringessentialtrainingApplication{

	@Autowired
	private GetRoomsRunner roomsRunner;

	@Autowired
	private FizzBuzzRunner fizzBuzzRunner;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			//roomsRunner.run(restTemplate);
			//fizzBuzzRunner.run();
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringessentialtrainingApplication.class, args);
	}
}
