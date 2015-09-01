package sakila.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="actor_id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="last_update")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;
	
	protected Actor() {};
	
	public String toString() {
		return String.format("Actor[id=%d, firstName=%s, lastName=%s]", 
				id, firstName, lastName);
	}
}
