package app.domain.models;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Setter	
@Getter 
@NoArgsConstructor

public class User extends Person{
	private long userId;
	private String userName;
	private String password;
	
	public User(long personId, long document, String name, int age, String role, long userId, String userName,
			String password) {
		super(personId, document, name, age, role);
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		
	}
}
	
	
