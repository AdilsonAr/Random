package com.random;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.random.service.PersonaService;

@SpringBootApplication
public class RandomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RandomApplication.class, args);

		PersonaService serv = context.getBean(PersonaService.class);
		
		crearArchivo( serv.fechas(), new File("C:/Users/KGB/Desktop/@Dfadb/fechasg.txt"));
		/*crearArchivo( serv.generate02(), new File("C:/Users/KGB/Desktop/@Dfadb/ar02.txt"));
		crearArchivo( serv.generate03(), new File("C:/Users/KGB/Desktop/@Dfadb/ar03.txt"));
		crearArchivo( serv.generate04(), new File("C:/Users/KGB/Desktop/@Dfadb/ar04.txt"));*/
	}
	
	private static void crearArchivo(String t1,File ar1) {
		FileWriter escribir1=null;
		try {
			escribir1 = new FileWriter(ar1,true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			escribir1.write(t1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			escribir1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
