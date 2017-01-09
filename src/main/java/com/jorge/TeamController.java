package com.jorge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Try it: http://localhost:8080/teams
 *
 */
@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/teams")
	public List<Team> getTeams() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setId(0l);
		team.setLocation("Madrid");
		team.setName("Atlético de Madrid");
		list.add(team);

		team = new Team();
		team.setId(1l);
		team.setLocation("León");
		team.setName("Cultural Leonesa");
		list.add(team);

		return list;
	}

	@RequestMapping("/findAll")
	public Iterable<Team> crudTeams() {
		return teamRepository.findAll();
	}
	
	@RequestMapping("/findOne/{id}")
	public Team crudTeams(@PathVariable Long id) {
		return teamRepository.findOne(id);
	}
}
