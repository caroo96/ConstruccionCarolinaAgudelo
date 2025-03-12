package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class Seller extends User {
	
	private long sellerd;

	public Seller(long personId, long document, String name, int age, String role, long userId, String userName,
			String password, long sellerd) {
		super(personId, document, name, age, role, userId, userName, password);
		this.sellerd = sellerd;
	}
		

}
