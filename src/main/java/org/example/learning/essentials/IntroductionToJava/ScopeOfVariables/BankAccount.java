package org.example.learning.essentials.IntroductionToJava.ScopeOfVariables;

/**
 * Created by User on 24.05.2025
 */
public class BankAccount {

    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if(amount > balance) {
            throw new IllegalArgumentException("Nie masz wystarczająco środków na koncie.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
