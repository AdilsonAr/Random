package com.random;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.random.model.Persona;
import com.random.repository.PersonRepository;

@SpringBootTest
class RandomApplicationTests {
	@Autowired
	static PersonRepository repo;
	@Test
	void contextLoads() {
		List<Persona> lista=new ArrayList<Persona>();
		lista=repo.readNames01();
		for (Persona qu:lista) {
			System.out.println(qu.getName());
		}
		assertNotNull(lista);
	}

}
