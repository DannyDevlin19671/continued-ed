package com.neueda.springboot.jpaexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JpaexampleApplicationTests {

	@Autowired
	private CustomerRepository repository;

	@BeforeEach
	public void setUp(){
		repository.deleteAll();
		repository.saveAll(Arrays.asList(
				new Customer("Daniel", "Devlin"),
				new Customer("James", "Devlin"),
				new Customer("Sarah", "Devlin"),
				new Customer("Emma", "Devlin")
		));
	}

	@Test
	public void testFindAllCustomers(){
		List<Customer> customers = repository.findAll();
		assertTrue(customers.size()>0);
		assertTrue(customers.size()==4);
	}

	@Test
	public void testGetCustomerByFirstName(){
		List<Customer> customers = repository.findByfirstName("Emma");
		assertTrue(customers.size() == 1);
		Customer customer = customers.getFirst();
		assertTrue(customer.getFirstName().equals("Emma"));
		assertTrue(customer.getLastName().equals("Devlin"));
	}

	@Test
	public void testDeleteCustomerById() {
		Customer customer = repository.findAll().get(0);
		repository.delete(customer);
		assertTrue(repository.findAll().size() == 3);
	}

}
