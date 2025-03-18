package com.example.projects.bankaccountsystem;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
class SavingsAccount extends Account {
    public SavingsAccount(double balance) { super(balance); }

    @Override
    public void deposit(double amount) { balance += amount; }
    @Override
    public void withdraw(double amount) { balance -= amount; }
}
