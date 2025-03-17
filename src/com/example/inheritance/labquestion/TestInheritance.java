package com.example.inheritance.labquestion;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
// Main class to test inheritance and polymorphism
public class TestInheritance {
    public static void main(String[] args) {
        // Creating an array of Account references (polymorphism)
        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount("Alice", 2.0);
        accounts[1] = new SavingsAccount("Bob", 4.0);
        accounts[2] = new CurrentAccount("Charlie", 6.0);

        // Applying interest to each account
        for (Account acc : accounts) {
            acc.addInterest(); // Calls the correct overridden method
            acc.display(); // Display updated balances
        }
    }
}
