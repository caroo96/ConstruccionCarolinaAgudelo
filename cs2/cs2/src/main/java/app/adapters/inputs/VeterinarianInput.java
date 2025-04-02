package app.adapters.inputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapters.inputs.utils.PersonValidator;
import app.adapters.inputs.utils.UserValidator;
import app.adapters.inputs.utils.Utils;
import app.domain.models.Person;
import app.domain.models.User;
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

	
	public void menu() {
		boolean sesion = true;
		while (sesion) {
			sesion = options();
		}
	}
	
	private boolean options() {
		try {
			System.out.println(MENU);
			String option = Utils.getReader().nextLine();
			switch (option) {
			case "1": {
					this.createPerson();
					return true;
			}			
			case "3" :{
				System.out.println("Se ha cerrado sesion");
				return false;
			}
			default:
				System.out.println("opcion no valida");
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return true;
		}
	}

	private void createPerson() throws Exception {
		System.out.println("ingrese el nombre");
		String name = personValidator.nameValidator(Utils.getReader().nextLine());
		System.out.println("ingrese el documento");
		long document = personValidator.documentValidator(Utils.getReader().nextLine());
		System.out.println("ingrese la edad");
		int Age = personValidator.ageValidator(Utils.getReader().nextLine());
		System.out.println("ingrese el rol");
		String role = personValidator.nameValidator(Utils.getReader().nextLine());
		Person person = new User();
		person.setDocument(document);
		person.setName(name);
		person.setAge(Age);
		person.setRole(role);
		veterinarianService.registerPerson(person);
	}
}
