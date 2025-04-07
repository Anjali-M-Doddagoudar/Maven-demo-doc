package com.mavendemo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("----- Setting up new test -----");
        account = new BankAccount(100.0);
    }

    @Test
    public void testDeposit() {
        System.out.println("Running testDeposit()");
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDeposit() {
        System.out.println("Running testNegativeDeposit()");
        account.deposit(-10);
    }

    @Test
    public void testWithdraw() {
        System.out.println("Running testWithdraw()");
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverdraw() {
        System.out.println("Running testOverdraw()");
        account.withdraw(200.0);
    }
}
