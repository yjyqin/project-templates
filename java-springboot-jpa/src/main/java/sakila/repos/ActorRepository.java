package sakila.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sakila.domains.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
	
	List<Actor> findByLastName(String lastName);
}
