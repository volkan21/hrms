package volkan.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="candidates")

public class Candidates {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String  first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="identity_number")
	private String identity_number;
	@Column(name="birth_year")
	private int birth_year;
	
	public Candidates() {
		super();
	}
	public Candidates(int id, String first_name, String last_name, String identity_number, int birth_year) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.identity_number = identity_number;
		this.birth_year = birth_year;
	}
	
	
	

}
