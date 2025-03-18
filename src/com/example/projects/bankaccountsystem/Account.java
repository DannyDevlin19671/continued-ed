package com.example.projects.bankaccountsystem;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
