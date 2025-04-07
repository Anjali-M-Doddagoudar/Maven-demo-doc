package com.mavendemo;

public class BankAccount {
    private double balance;

    public BankAccount(double initialAmount) {
        if (initialAmount < 0) throw new IllegalArgumentException("Invalid initial balance");
        this.balance = initialAmount;
        System.out.println("Account created with balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Negative deposit not allowed");
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
        System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
    }

    public double getBalance() {
        System.out.println("Checking balance: " + balance);
        return balance;
    }
}
