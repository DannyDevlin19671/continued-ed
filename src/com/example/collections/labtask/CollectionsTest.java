package com.example.collections.labtask;

import java.util.*;
/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */

public class CollectionsTest {
    public static void main(String[] args) {
        // Step 1: HashSet implementation
        HashSet<Account> accounts = new HashSet<>();

        // Adding accounts to the HashSet
        accounts.add(new SavingsAccount("Alice", 2000));
        accounts.add(new CurrentAccount("Bob", 3000));
        accounts.add(new SavingsAccount("Charlie", 1000));

        // Iteration using Iterator
        System.out.println("Using Iterator:");
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account acc = iterator.next();
            acc.display();
            acc.addInterest();
            acc.display();
        }

        // Iteration using enhanced for-loop
        System.out.println("\nUsing For-Each Loop:");
        for (Account acc : accounts) {
            acc.display();
            acc.addInterest();
            acc.display();
        }

        // Iteration using Java 8 forEach with Lambda
        System.out.println("\nUsing Java 8 forEach:");
        accounts.forEach(acc -> {
            acc.display();
            acc.addInterest();
            acc.display();
        });

        // Step 1: Using TreeSet with AccountComparator
        TreeSet<Account> treeSetAccounts = new TreeSet<>(new AccountComparator());
        //TreeSet<Account> treeSetAccounts = new TreeSet<>((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));
        // Adding accounts
        treeSetAccounts.add(new SavingsAccount("Alice", 2000));
        treeSetAccounts.add(new CurrentAccount("Bob", 3000));
        treeSetAccounts.add(new SavingsAccount("Charlie", 1000));

        // Display accounts (sorted by balance)
        System.out.println("\nAccounts sorted using AccountComparator:");
        treeSetAccounts.forEach(Account::display);
    }
}
