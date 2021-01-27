package com.conor.SojernCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SojernCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SojernCodeApplication.class, args);
	}

	@Bean
	public MathService getMathService() {
		return new MathServiceImpl();
	}

}
