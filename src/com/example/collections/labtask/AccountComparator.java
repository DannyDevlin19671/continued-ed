package com.example.collections.labtask;

import java.util.Comparator;
/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */

public class AccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return Double.compare(a1.getBalance(), a2.getBalance());
    }
}
