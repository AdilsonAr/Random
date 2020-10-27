package com.random.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.random.model.Persona;
import com.random.repository.PersonRepository;

@Service
public class PersonaService {

	// int valorEntero = Math.floor(Math.random()*(N-M+1)+M); // Valor entre M y N,
	@Autowired
	PersonRepository repo;

	public String generate() {

		String sql = "insert into usuario values ";
		List<Persona> lista = new ArrayList<Persona>();
		lista = repo.readNames01();
		for (Persona qu : lista) {
			sql += "(" + qu.getId() + "," + (qu.getName() + (int)Math.floor(Math.random() * 50 + 1)) + ","
					+ (int)Math.floor(Math.random() * (9999999 - 1000000 + 1) + 1000000) + ","
					+ (int)Math.floor(Math.random() * (3) + 1) + " ),\n";
		}
		sql += ";";
		return sql;
	}

}
