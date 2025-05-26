package org.example.learning.essentials.OOP.classes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BankAccountTest {

    @Test
    void testInitialBalanceShouldBeZero() {
        BankAccountV1 acc = new BankAccountV1();
        assertEquals(0, acc.getBalance());
    }

    @Test
    void testDepositPositiveAmountIncreasesBalance() {
        BankAccountV1 acc = new BankAccountV1();
        acc.deposit(500);
        assertEquals(500, acc.getBalance());
    }

    @Test
    void testDepositNegativeAmountThrowsException() {
        BankAccountV1 acc = new BankAccountV1();
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-100));
    }

    @Test
    void testWithdrawValidAmountReducesBalance() {
        BankAccountV1 acc = new BankAccountV1();
        acc.deposit(1000);
        acc.withdraw(300);
        assertEquals(700, acc.getBalance());
    }

    @Test
    void testWithdrawNegativeAmountThrowsException() {
        BankAccountV1 acc = new BankAccountV1();
        acc.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(-50));
    }

    @Test
    void testWithdrawTooMuchThrowsCustomException() {
        BankAccountV1 acc = new BankAccountV1();
        acc.deposit(100);
        assertThrows(InsufficientFundsExceptionV1.class, () -> acc.withdraw(200));
    }


}
