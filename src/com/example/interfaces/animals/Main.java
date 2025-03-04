package com.java.interfaces.animals;

/**
 * @author danieldevlin
 * @date 03/03/2025
 * @project Interfaces
 */
public class Main {
    public static void main(String[] args){
        Bird parrot = new Bird("Rio");
        parrot.speak();
        parrot.move();

        Dog dog = new Dog("Scrappy");
        dog.speak();
        dog.move();
    }
}
