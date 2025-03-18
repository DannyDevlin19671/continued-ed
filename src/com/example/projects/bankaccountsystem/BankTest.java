package com.example.projects.bankaccountsystem;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class BankTest {
    public static void main(String[] args) {
        Account acc = new SavingsAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Final Balance: " + acc.balance);
    }
}
