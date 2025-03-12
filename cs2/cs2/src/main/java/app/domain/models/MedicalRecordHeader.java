package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter	
@Getter 
@NoArgsConstructor

public class MedicalRecordHeader {
	
	private long medicalRecordHeaderId;
	private Pet pet;
	private Owner owner;
	
	
	public MedicalRecordHeader(long medicalRecordHeaderId, Pet pet, Owner owner) {
		super();
		this.medicalRecordHeaderId = medicalRecordHeaderId;
		this.pet = pet;
		this.owner = owner;
	}
}
