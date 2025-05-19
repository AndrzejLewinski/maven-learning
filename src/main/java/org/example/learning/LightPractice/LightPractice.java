package org.example.learning.LightPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 19.05.2025
 */
public class LightPractice {

    private static final Logger logger = LoggerFactory.getLogger(LightPractice.class);

    public static void main(String[] args) {



    }

    private static void whatIsComputer() {
        logger.info("A computer is a machine that executes instructions contained in a program.");
        logger.info("Programming is the process of creating those instructions that allow the computer to solve problems.");
        logger.info("A programming language is a tool that allows the programmer to communicate with the computer by giving it commands.");
        logger.info("Below is an example of the simplest program in Java that displays text on the screen.");
        System.out.println("Welcome to the world of programming! This is the simplest program that can print text.");

    }

    private static void variablesAndDataTypes(){
        StringBuilder stringBuilder = new StringBuilder();
        String name = "Andrzej";
        int age = 35;
        double weight = 108.0;
        boolean ifCoder = true;
        logger.info("We're changing components to one string");
        String output = stringBuilder
                .append("Name: ").append("  ").append(name).append("\n")
                .append("Age: ").append("        ").append(age).append("\n")
                .append("Weight: ").append("  ").append(weight).append("\n")
                .append("Is Coder:  ").append(ifCoder).toString();
        System.out.println(output);
    }


    private static int add(int a, int b){
        return a+b;
    }

    private static void greet(String name){
        System.out.println("Hey, "+name);
    }

    private static void forLoop(int n){
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

    private static void ageCoclusions(int n){
        if (n == 16) {
            System.out.println("It's time to make a driving licence");
        } else if (n >= 18) {
            System.out.println("Adult");
        } else if (n < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("There are no conclusions for this year of your age in this particular program");
        }
    }

    private static int sumFromOneToNumber(int n){
        int sum = 0;
        for(int counter =1; counter<=n; counter++){
            sum+=counter;
        }
        return sum;
    }

    private static boolean isLessThan100(int a, int b){
        return a<100 && b<100;
    }

    private static boolean ifGreater(int a, int b){
        return a>b;
    }

    private static void addition(int a, int b){
        System.out.println(a+b);
    }

    private static void helloWorld() {
        logger.info("Programming is printing the text.");
        System.out.println("Hello World!");
    }


}
