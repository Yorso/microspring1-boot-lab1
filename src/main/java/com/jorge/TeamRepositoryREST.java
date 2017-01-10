package com.jorge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

//Spring Data REST Repositories
//Try it:
//	  http://localhost:8080/teamsREST     =>  Muestra info de todos los equipos
//	  http://localhost:8080/teamsREST/2   =>  Muestra info del equipo 2
//    http://localhost:8080/teamsREST/2/players  => Muestra los jugadores del equipo 2
@RestResource(path="teamsREST", rel="team") 
public interface TeamRepositoryREST extends CrudRepository<Team, Long>{
	
}
