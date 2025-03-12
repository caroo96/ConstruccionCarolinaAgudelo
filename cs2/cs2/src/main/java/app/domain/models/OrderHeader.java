package app.domain.models;

import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class OrderHeader {
	
	private long orderId;
	private Pet pet;
	private Owner owner;
	private Veterinarian veterinarian;	
	private Date dateCreated;
	private boolean status;
	
	
	public OrderHeader(long orderId, Pet pet, Owner owner, Veterinarian veterinarian, Date dateCreated,
			boolean status) {
		super();
		this.orderId = orderId;
		this.pet = pet;
		this.owner = owner;
		this.veterinarian = veterinarian;
		this.dateCreated = dateCreated;
		this.status = status;
	}
}
