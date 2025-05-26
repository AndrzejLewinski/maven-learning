package org.example.learning.essentials.OOP.classes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by User on 26.05.2025
 */
public final class BankAccountV1 {

    private static final Logger logger = LoggerFactory.getLogger(BankAccountV1.class);

    private final Object lock = new Object();

    private int balance;

    public int getBalance() {
        synchronized (lock) {
            return balance;
        }
    }


    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
        synchronized (lock) {
            balance += amount;
            logger.info("Deposited: {} . New balance: {}", amount, balance);
        }
    }

    /**
     * @throws InsufficientFundsExceptionV1 if balance is insufficient
     * @throws IllegalArgumentException if amount <=0
     * @param amount Amount to withdraw
     */
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive!");
        }
        synchronized (lock) {
            if (amount > balance) {
                throw new InsufficientFundsExceptionV1("Insufficient funds! Current balance: " + balance);
            }
            balance -= amount;
            logger.info("Withdrew: {} . New balance: {}", amount, balance);
        }
    }

    @SuppressWarnings("unused")
    @Deprecated
    private void printBalance () {
        logger.info("Balance={}", balance);
    }
}