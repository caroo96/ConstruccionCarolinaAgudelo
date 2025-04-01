package app.domain.services;

import app.domain.models.Person;
import app.ports.PersonPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Setter
@Getter
@NoArgsConstructor
@Service

public class VeterinarianService {
	
	 @Autowired
	    private PersonPort personPort;
	 
	 public void registerPerson(Person person)throws Exception{
	        if (personPort.existPerson(person.getDocument())){
	            throw new Exception("ya existe una persona con esa cedula");
	        }               
	        
	        personPort.savePerson(person);
	    
	    }
	 }