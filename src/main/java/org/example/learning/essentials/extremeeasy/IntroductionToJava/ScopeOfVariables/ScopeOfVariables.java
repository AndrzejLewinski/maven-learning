package org.example.learning.essentials.extremeeasy.IntroductionToJava.ScopeOfVariables;

import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 24.05.2025
 */
public class ScopeOfVariables {

    private static final Logger logger = LoggerFactory.getLogger(ScopeOfVariables.class);

    static int variable = 10;
    static int number   = 10;
    static int counter  =  0;
    static int score    = 10;

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");

        ScopeOfVariables scopeOfVariables = new ScopeOfVariables();

        scopeOfVariables.simpleBankOperations();


        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");


    }

    private void simpleBankOperations() {

        BankAccount bankAccount = new BankAccount(0);
        bankAccount.deposit(1000);
        System.out.println(bankAccount.getBalance());
        System.out.println();

        List<Integer> collect = IntStream.range(0, 100).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());

        for(int i = 0; i < 25; i++){
            int amount = collect.get(i);
            System.out.println("bank account balance: " + bankAccount.getBalance());
            try {
                bankAccount.withdraw(amount);
                System.out.println("Withdrawn: " + amount);
            } catch (IllegalArgumentException e) {
                System.out.println("Failed to withdraw: " + amount + " (" + e.getMessage() + ")");
            }
            System.out.println("bank account balance now: " + bankAccount.getBalance());
        }

    }


    private void modifyScores() {

        ScopeOfVariables.score = 30;
        //shadowing
        int score = 20;
        System.out.println("Local score = "+score);
        System.out.println("Global score = "+ScopeOfVariables.score);


    }

    private void incrementCounter() {

        int globalCounter = ScopeOfVariables.counter;
        //shadowing
        int counter = 5;
        globalCounter++;
        System.out.println("global counter = "+globalCounter);
        System.out.println("local counter = "+counter);

    }

    private void showValues() {
        int number1 = ScopeOfVariables.number;
        int number = 5;
        System.out.println(number1);
        System.out.println(number);
    }

    @SuppressWarnings("unused")
    private void exampleThree() {
        System.out.println();
        int variable = 11;
        System.out.println("Local x = "+variable);
        System.out.println("Global x = "+ScopeOfVariables.variable);

        System.out.println();
    }

    @SuppressWarnings("unused")
    private void exampleTwo() {

        @SuppressWarnings("UnusedAssignment")
        int a = 100;
        {
            a = 50;
            System.out.println(a);
        }
        System.out.println(a);

    }

    @SuppressWarnings("unused")
    private void exampleOne() {
        int x = 10;
        {
            int y = 20;
            System.out.println(y);
        }
        System.out.println(x);
    }
}


























