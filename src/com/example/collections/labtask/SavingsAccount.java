package com.example.collections.labtask;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
// SavingsAccount class extending Account
public class SavingsAccount extends Account {
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void addInterest() {
        setBalance(getBalance() * 1.4); // 40% increase
    }
}
