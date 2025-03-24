package com.neueda.springboot.jpaexample;

/**
 * @author danieldevlin
 * @date 24/03/2025
 * @project jpaexample
 */
public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(Long id){
        super("Customer not found with ID:"+ id);
    }
}
