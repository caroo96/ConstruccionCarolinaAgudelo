package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.CommandLineRunner;

import app.adapters.inputs.LoginInput;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Getter;
import lombok.Setter;


@SpringBootApplication
public class VeterinariaApplication implements CommandLineRunner{
	
	 @Autowired
	    private ListableBeanFactory beanFactory;
	 
	  @Autowired
	    private LoginInput loginInput;
	  
	  @Override
	    public void run(String... args) throws Exception {
	        /*System.out.println("Beans registrados en la aplicación:");
	        String[] beanNames = beanFactory.getBeanDefinitionNames();
	        for (String beanName : beanNames) {
	            System.out.println(beanName);
	        }*/
	    	loginInput.menu();
	    }

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaApplication.class, args);
	}

}
