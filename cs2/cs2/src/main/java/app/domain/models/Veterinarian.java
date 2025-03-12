package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class Veterinarian extends User {
	
	private long veterinarianId;

	public Veterinarian(long personId, long document, String name, int age, String role, long userId, String userName,
			String password, long veterinarianId) {
		super(personId, document, name, age, role, userId, userName, password);
		this.veterinarianId = veterinarianId;
	}

}
