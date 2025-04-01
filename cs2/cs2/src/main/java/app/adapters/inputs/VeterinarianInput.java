package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapters.inputs.utils.PersonValidator;
import app.adapters.inputs.utils.UserValidator;
import app.adapters.inputs.utils.Utils;
import app.domain.models.Person;
import app.domain.services.VeterinarianService;
import app.ports.InputPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Component

public class VeterinarianInput implements InputPort  {
	
	@Autowired
	private PersonValidator personValidator;
	@Autowired
	private VeterinarianService veterinarianService;
	
	private final String MENU = "Ingrese la opcion:" + " \n 1.Registrar dueño mascota." + " \n 2.Registrar mascota."
			+ " \n 3.Registrar historia clinica.";

	@Override
	public void menu() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
