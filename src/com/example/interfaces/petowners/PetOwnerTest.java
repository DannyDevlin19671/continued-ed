package com.example.interfaces.petowners;

/**
 * @author danieldevlin
 * @date 06/03/2025
 * @project continued-ed
 */
public class PetOwnerTest {
    public static void main(String[] args){
        Person p = new Person();
        Cat pet = new Cat();
        p.setPet(pet);
        p.getPet().feed();
    }
}
