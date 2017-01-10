package com.jorge;

import org.springframework.data.repository.CrudRepository;

//Spring Data JPA Repositories
public interface TeamRepositoryJPA extends CrudRepository<Team, Long>{
	
}
