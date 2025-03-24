package com.neueda.springboot.jpaexample;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author danieldevlin
 * @date 24/03/2025
 * @project jpaexample
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    List<Customer> findByfirstName(String firstName);
    // find by last name
    Customer findById(long id);
}
