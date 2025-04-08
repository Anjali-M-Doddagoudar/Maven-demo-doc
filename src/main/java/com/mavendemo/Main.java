package com.mavendemo;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(30.0);
        System.out.println("Final Balance: " + account.getBalance());
    }
    
}
