package sakila;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sakila.domains.Actor;
import sakila.repos.ActorRepository;

@SpringBootApplication
public class Application {
	
	private Logger log = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private ActorRepository repository;
	
	public void run(String...strings) {
		for(Actor actor: repository.findAll()) {
			log.info(actor.toString());
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
