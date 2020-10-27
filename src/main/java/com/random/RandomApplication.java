package com.random;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.random.model.Persona;
import com.random.repository.PersonRepository;

@SpringBootApplication
public class RandomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(RandomApplication.class, args);
		
		PersonRepository repo= context.getBean(PersonRepository.class);
		List<Persona> lista=new ArrayList<Persona>();
		lista=repo.readNames01();
		for (Persona qu:lista) {
			System.out.println(qu.getName());
		}
	}

}
