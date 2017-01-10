package com.jorge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

//Spring Data REST Repositories
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
