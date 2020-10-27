package com.random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.random.service.PersonaService;

@SpringBootApplication
public class RandomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(RandomApplication.class, args);
		
		PersonaService serv = context.getBean(PersonaService.class);
		System.out.print(serv.generate());
		
	}

}
