package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class Pet {
	
	private long petId;
	private String name;
	private Person person;
	private int age; 
	private String species;
	private String race;
	private String characteristics;
	private double weight;
	
	
	public Pet(long petId, String name, Person person, int age, String species, String race, String characteristics,
			double weight) {
		super();
		this.petId = petId;
		this.name = name;
		this.person = person;
		this.age = age;
		this.species = species;
		this.race = race;
		this.characteristics = characteristics;
		this.weight = weight;
	}

}
	
	


