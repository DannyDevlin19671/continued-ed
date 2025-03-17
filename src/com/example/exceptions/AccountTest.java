package com.example.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class AccountTest {
    public static void main(String[] args){
        ArrayList<String> people = new ArrayList<>();
        people.add("Daniel");
        people.add("fingers");
        people.add("Liam");
        people.add("Alexandra");

        try{
            Account acc = new Account(people);
        }catch(DodgyNameException ex){
            System.out.println(ex);
        }

        people = new ArrayList<>();
        people.add("Daniel");
        people.add("Liam");
        people.add("fingers");
        people.add("Alexandra");

        try{
            Account acc2 = new Account(people);
        }catch(DodgyNameException ex){
            System.out.println(ex);
        }

//        try {
//            Account acc3 = new Account(people);
//            System.out.println(acc3);
//        }catch(DodgyNameException ex){
//            System.out.println("Daniel caused an error");
//        }
    }
}
