package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages="com")
public class RoomCleaningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomCleaningServiceApplication.class, args);
	}
	
	@Bean
	public LocalValidatorFactoryBean validator(MessageSource msg)
	{
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		
		bean.setValidationMessageSource(msg);
		
		return bean;
		
	}

}
