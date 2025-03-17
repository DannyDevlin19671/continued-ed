package com.example.inheritance.labquestion;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
// Abstract class Account
public abstract class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method (forcing subclasses to implement their own version)
    public abstract void addInterest();

    // Display account details
    public void display() {
        System.out.printf("Account Holder: %s, Balance: %1.2f\n", name, balance);
    }
}
