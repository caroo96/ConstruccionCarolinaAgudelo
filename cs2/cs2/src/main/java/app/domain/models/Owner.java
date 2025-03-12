package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class Owner extends Person {
	private long ownerId;

	public Owner(long personId, long document, String name, int age, String role, long ownerId) {
		super(personId, document, name, age, role);
		this.ownerId = ownerId;
	}
	
}
