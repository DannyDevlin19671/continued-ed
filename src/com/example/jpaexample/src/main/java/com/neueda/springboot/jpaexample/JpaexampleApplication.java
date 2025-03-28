package com.neueda.springboot.jpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaexampleApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaexampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaexampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository){
		return (args -> {
			repository.save(new Customer("Daniel", "Devlin"));
			repository.save(new Customer("James", "Bond"));
			repository.save(new Customer("Stephen", "Hawkings"));

			log.info("Completed saving customers");
			log.info("==========================");


			try{
				Customer customer = repository.findById(18L);
				if(customer == null){
					throw new CustomerNotFoundException(18L);
				}
				log.info("Customer found with Id=(1L)");
				log.info(customer.toString());
			}catch(CustomerNotFoundException ex){
				log.error(ex.toString());
			}

			Customer customerTwo = repository.findByfirstName("Daniel").getFirst();
			log.info("Customer found with firstName Daniel");
			log.info(customerTwo.toString());
		});
	}

}
