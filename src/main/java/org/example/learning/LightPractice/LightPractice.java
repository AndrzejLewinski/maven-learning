package org.example.learning.LightPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 19.05.2025
 */
public class LightPractice {

    private static final Logger logger = LoggerFactory.getLogger(LightPractice.class);

    public static void main(String[] args) {

        System.out.println(1);
    }

    @SuppressWarnings("unused")
    private void whatIsComputer() {
        logger.info("A computer is a machine that executes instructions contained in a program.");
        logger.info("Programming is the process of creating those instructions " +
                "that allow the computer to solve problems.");
        logger.info("A programming language is a tool that allows the programmer " +
                "to communicate with the computer by giving it commands.");
        logger.info("Below is an example of the simplest program in Java that displays text on the screen.");
        System.out.println("Welcome to the world of programming! This is the simplest program that can print text.");

    }

    public int add(int a, int b){
        return a+b;
    }

    @SuppressWarnings("unused")
    private void greet(String name){
        System.out.println("Hey, "+name);
    }

    @SuppressWarnings("unused")
    private void forLoop(int n){
        for(int counter =1;counter<=n;counter++){
            System.out.print(counter+" ");
        }
        System.out.println();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
    }

    @SuppressWarnings("unused")
    private static void ageCoclusions(int n){
        if (n == 16) {
            System.out.println("It's time to make a driving licence");
        } else if (n >= 18) {
            System.out.println("Adult");
        }else {
            System.out.println("There are no conclusions for this year of your age in this particular program");
        }
    }

    @SuppressWarnings("unused")
    private int sumFromOneToNumber(int n){
        int sum = 0;
        for(int counter =1; counter<=n; counter++){
            sum+=counter;
        }
        return sum;
    }
    @SuppressWarnings("unused")
    private boolean isLessThan100(int a, int b){
        return a<100 && b<100;
    }
    @SuppressWarnings("unused")
    private boolean ifGreater(int a, int b){
        return a>b;
    }
    @SuppressWarnings("unused")
    private void addition(int a, int b){
        System.out.println(a+b);
    }
    @SuppressWarnings("unused")
    private void helloWorld() {
        logger.info("Programming is printing the text.");
        System.out.println("Hello World!");
    }


}
