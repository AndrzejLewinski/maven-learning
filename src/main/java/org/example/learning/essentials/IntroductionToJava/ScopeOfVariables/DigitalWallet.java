package org.example.learning.essentials.IntroductionToJava.ScopeOfVariables;

/**
 * Created by User on 24.05.2025
 */
public class DigitalWallet {

    double balance;



    public DigitalWallet(double balance) {
        this.balance = balance;
    }

    public void addFunds(double amount){
        balance+=amount;
    }

    public void spendFunds(double amount){
        if(balance<amount){
            throw new IllegalArgumentException("Insufficient funds in your bank account.");
        }
        balance-=amount;
    }

    public void transferTo(DigitalWallet otherWallet, double amount){
        if(balance<amount){
            throw new IllegalArgumentException("Insufficient funds in your bank account");
        }
        balance-=amount;
        otherWallet.balance +=amount;
    }

    public double getBalance() {
        return balance;
    }
}
