package com.example.interfaces.petowners;

/**
 * @author danieldevlin
 * @date 06/03/2025
 * @project continued-ed
 */
public class Dog implements Pet{
    private String name;
    private String breed;
    private int age;

    public Dog(){

    }

    public Dog(String name, String breed, int age){
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed() {
        System.out.println("The Dog has been fed..... woof woof");
    }
}
