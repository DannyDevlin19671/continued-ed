package com.example.exceptions;

import java.util.List;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class Account {
    private String name;
    public Account(List<String> names)throws DodgyNameException{
        for(String name: names) {
            if (name.equals("fingers")) {
                throw new DodgyNameException("fingers is not allowed an account");
            } else if (name.equals("Liam")) {
                throw new DodgyNameException("Liam you are barred");
            }
        }
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
