package app.domain.models;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Setter
@Getter
@NoArgsConstructor

public class Person {		
	private long personId;
	private long document;
	private String name;
	private int age;
	private String role;
		
	public Person(long personId, long document, String name, int age, String role) {
		super();
		this.personId = personId;
		this.document = document;
		this.name = name;
		this.age = age;		
		this.role = role;
	}
}

