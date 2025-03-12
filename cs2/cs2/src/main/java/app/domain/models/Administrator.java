package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class Administrator extends User {
	
	private long administratorId;

	public Administrator(long personId, long document, String name, int age, String role, long userId, String userName,
			String password, long administratorId) {
		super(personId, document, name, age, role, userId, userName, password);
		this.administratorId = administratorId;
	}

}
