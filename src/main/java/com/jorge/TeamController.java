package com.jorge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Este controlador es para cuando usemos Spring Data JPA Repositories. Si usamos Spring Data REST Repositories
//no necesitamos ningún controlador, ya que es el Repository quien se encarga de decirle a la vista qué hay que mostrar
@RestController
public class TeamController {

	@Autowired
	private TeamRepositoryJPA teamRepository;

	@RequestMapping("/teams") //http://localhost:8080/teams
	public List<Team> getTeams() {
		List<Team> list = new ArrayList<>();
		Set<Player> players = new HashSet<>();

		Team team = new Team();
		team.setId(0l);
		team.setLocation("Los Angeles");
		team.setName("Los Angeles Lakers");
		players.add(new Player(0L, "Frank Johnson", "Position 1"));
		players.add(new Player(1L, "John Franklin", "Position 2"));
		team.setPlayers(players);
		list.add(team);

		team = new Team();
		players = new HashSet<>();
		
		team.setId(1l);
		team.setLocation("Chicago");
		team.setName("Chicago Bulls");
		players.add(new Player(2L, "Peter Parker", "Position 7"));
		players.add(new Player(3L, "Park Peterson", "Position 8"));
		team.setPlayers(players);
		list.add(team);

		return list;
	}

	@RequestMapping("/findAll") //Try it: http://localhost:8080/findAll
	public Iterable<Team> crudTeams() {
		return teamRepository.findAll();
	}
	
	@RequestMapping("/findOne/{id}") //Try it: http://localhost:8080/findOne/1
	public Team crudTeams(@PathVariable Long id) {
		return teamRepository.findOne(id);
	}
}
