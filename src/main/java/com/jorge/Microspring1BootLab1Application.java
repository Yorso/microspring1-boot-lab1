package com.jorge;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Microspring1BootLab1Application {

	@Autowired
	private TeamRepositoryJPA teamRepositoryJPA;
	
	@Autowired
	private TeamRepositoryREST teamRepositoryREST;

	/**
	 * Used when run as a JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(Microspring1BootLab1Application.class, args);
	}

	//Éstos son los datos que se cargan automáticamente según se inicia el programa
	//Para Spring Data JPA Repositories los carga y se muestran en estas rutas:
	//	http://localhost:8080/findAll
	//	http://localhost:8080/findOne/1
	//
	//Para Spring Data REST Repositories se cargan y se muestran en esta ruta:
	//	http://localhost:8080/teamsREST
	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);

		team = new Team();
		
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		//Dependiendo si usamos Spring Data JPA Repositories o Spring Data REST Repositories hay que añadírselo
		//a su correspondiente repositorio
		teamRepositoryJPA.save(list);
		teamRepositoryREST.save(list);
		
		
	}
}
