package app.domain.models;

import java.sql.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class InvoiceHeader {
	
	private long invoiceHeaderId;
	private Pet pet;
	private Owner owner;	
	private Date dateCreated; 
	private double amount;
	private boolean status;
	
	public InvoiceHeader(long invoiceHeaderId, Pet pet, Owner owner, Date dateCreated, double amount, boolean status) {
		super();
		this.invoiceHeaderId = invoiceHeaderId;
		this.pet = pet;
		this.owner = owner;
		this.dateCreated = dateCreated;
		this.amount = amount;
		this.status = status;
	}	

}
