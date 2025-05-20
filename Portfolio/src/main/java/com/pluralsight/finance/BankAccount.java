package com.pluralsight.finance;

import ui.Valuable;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }
    public double getBalance() {
        return balance;
    }
    public double getValue() {
        return balance;

    }
}
