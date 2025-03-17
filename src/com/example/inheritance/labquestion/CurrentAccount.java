package com.example.inheritance.labquestion;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
// CurrentAccount class extending Account
public class CurrentAccount extends Account {
    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void addInterest() {
        setBalance(getBalance() * 1.1); // 10% increase
    }
}
