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
			sql += "(" + qu.getId() + ",'" + (qu.getName() + (int)Math.floor(Math.random() * 500 + 1)) + "','"
					+ (int)Math.floor(Math.random() * (9999999 - 1000000 + 1) + 1000000) + "',"
					+ (int)Math.floor(Math.random() * (2) + 1) + " ),\n";
		}
		sql += ";";
		return sql;
	}
	
	public String generate02() {

		String sql = "insert into empleado values ";
		List<Persona> lista = new ArrayList<Persona>();
		lista = repo.readNames01();
		for (Persona qu : lista) {
			int estado = (int) Math.floor(Math.random() * 2);
			String estadoCivil = "";
			if (estado == 0) {
				estadoCivil = "'soltero'";
			} else {
				estadoCivil = "'casado'";
			}
			int generocal = (int) Math.floor(Math.random() * 2);
			String genero = "";

			if (generocal == 0) {
				genero = "'masculino'";
			} else {
				genero = "'femenino'";
			}
			
			sql += "(" + qu.getId() + ",'" + qu.getName() + "','" + qu.getLastname() + "','"
					+ (qu.getName() + (int) Math.floor(Math.random() * 500 + 1) + "@gmail.com") + "','"
					+ (int) Math.floor(Math.random() * (9999 - 1000 + 1) + 1000) + "-"
					+ (int) Math.floor(Math.random() * (9999 - 1000 + 1) + 1000) + "',"
					+ (int) Math.floor(Math.random() * (10) + 1) + ",'"
					+ (int) Math.floor(Math.random() * (1990 - 1970 + 1) + 1970) + "/"
					+ (int) Math.floor(Math.random() * (12) + 1) + "/" + (int) Math.floor(Math.random() * (28) + 1)
					+ "','" + (int) Math.floor(Math.random() * (2015 - 2010 + 1) + 2010) + "/"
					+ (int) Math.floor(Math.random() * (12) + 1) + "/" + (int) Math.floor(Math.random() * (28) + 1)
					+ "'," + (int) Math.floor(Math.random() * (3000 - 400 + 1) + 400) + "," + estadoCivil + ","
					+ (int) Math.floor(Math.random() * 6) + "," + genero + ","
					+ (int) Math.floor(Math.random() * (8) + 1) + "," + (int) Math.floor(Math.random() * (3) + 1) + ","
					+ (int) Math.floor(Math.random() * (3) + 1) + "," + qu.getId() + "),\n";
		}
		sql += ";";
		return sql;
	}
	
	public String fechas() {
		String sql="insert into Dim_tiempo values: ";
		int ct=1;
		for (int i=0;i<12;i++) {
			int it=0;
			
			switch (i) {
			case 0:
				it=31;
				break;
			case 1:
				it=29;
				break;
				
			case 2:
				it=31;
				break;
				
			case 3:
				it=30;
				break;
			case 4:
				it=31;
				break;
			case 5:
				it=30;
				break;
			case 6:
				it=31;
				break;
			case 7:
				it=31;
				break;
			case 8:
				it=30;
				break;
			case 9:
				it=31;
				break;
			case 10:
				it=30;
				break;
			case 11:
				it=31;
				break;
			}
			for (int j=0;j<it;j++) {
				sql+="("+ct+",'2020-"+(i+1)+"-"+(j+1)+"',"+2020+","+(i+1)+","+(j+1)+"),\n";
				ct++;
			}
		}
		
		return sql;
	}
	
	public String generate03() {

		String sql = "insert into consulta values ";
		
		for (int i=0;i<2000;i++) {
			sql += "(" + (i+1) + ",'" + 2020 + "/"
					+ (int) Math.floor(Math.random() * (10) + 1) + "/" + (int) Math.floor(Math.random() * (28) + 1)+ "',"	
					+ (int)Math.floor(Math.random() * (30 ) + 1) + ","
							+ (int)Math.floor(Math.random() * (50) + 1) + ","
									+ (int)Math.floor(Math.random() * (2000) + 1) + ","
					+ (int)Math.floor(Math.random() * (4) + 1) + " ),\n";
		}
		sql += ";";
		return sql;
	}
	
	public String generate04() {

		String sql = "insert into cliente values ";
		List<Persona> lista = new ArrayList<Persona>();
		lista = repo.readNames02();
		int i=1;
		for (Persona qu : lista) {
			sql += "(" + i + ",'" + qu.getName() + "','"+qu.getLastname() 
					+ "','"
					+ (qu.getName() + (int) Math.floor(Math.random() * 500 + 1) + "@gmail.com") + "','"
					+ (int) Math.floor(Math.random() * (9999 - 1000 + 1) + 1000) + "-"
					+ (int) Math.floor(Math.random() * (9999 - 1000 + 1) + 1000) + "' ),\n";
			
			i++;
		}
		sql += ";";
		return sql;
	}

}
