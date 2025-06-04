package org.example.learning.essentials.IntroductionToJava.JavaBasicsSummary;

import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 24.05.2025
 */
public class JavaBasicsSummary {


    private static final Logger logger = LoggerFactory.getLogger(JavaBasicsSummary.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");

        JavaRepetition javaRepetition = new JavaRepetition();
        javaRepetition.guessTheNumber();

        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }

    private static class JavaRepetition{

        @SuppressWarnings("unused")
        public void updateAndPrintTemperature() {
            @SuppressWarnings("UnusedAssignment") float temperature = 22.5f;
            temperature = 25.5f;
            System.out.println(temperature);
        }

        @SuppressWarnings({"ConstantValue", "unused"})
        public void checkEvenOddUsingTernary() {
            int x = 10;
            boolean condition = x%2==0;
            String result = condition ? "Even" : "Odd";
            System.out.println(result);
        }
        @SuppressWarnings("unused")
        public void dayOfTheWeekFromSwitch() {
            int day = 3;
            String result = String.valueOf(switch (day){
                case 1 -> "Monday";
                case 2 -> "tuesday";
                //noinspection DataFlowIssue
                case 3 -> "wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> throw new IllegalStateException("Unexpected value: " + day);
            });
            System.out.println(result);
        }

        public void guessTheNumber() {




        }
    }
    @SuppressWarnings({"unused", "UnusedAssignment"})
    private static class BackupClass {
        private void printNumbersUsingWhileLoop(){
            System.out.println();
            boolean condition = false;
            int counter = 1;
            while (counter<6){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("\n");
        }
        @SuppressWarnings("ConstantValue")
        private void compareTwoNumbers(){
            int num1 = 15;
            int num2 = 10;
            boolean isGreater = false;
            if(num1>num2){
                System.out.println(num1+" > "+num2);
            }if(num1==num2){
                System.out.println(num1+" = "+num2);
            }if(num1<num2){
                System.out.println(num1+" < "+num2);
            }
        }
        private void addTwoNumbers(){
            int a = 10;
            int b = 20;
            int result = a+b;
            logger.info("Result = {}",result);

        }
        public void declareAndPrintAge() {
            int age = 25;
            System.out.println(age);
        }
        @SuppressWarnings("unused")
        private void javaBasicsSummary() {
            System.out.println("We're doing Java repetition.");
        }
        @SuppressWarnings("unused")
        private void helloWorld() {
            System.out.println("hello world!");
        }
        public void printNumbersUsingForLoop() {
            System.out.println();
            for(int i =1;i<11;i++){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
        public void basicCalculation() {
            double a = 4.5;
            double b = 3.2;
            double result = (a+b)/2;
            System.out.println(result);
        }
        public void greetUserByName() {
            String name = "Andrzej";
            logger.info("Hello, {}",name);

        }
        @SuppressWarnings("ConstantValue")
        public void checkEvenOrOdd() {
            int num = 50;
            boolean condition = false;
            //noinspection ConstantValue
            if(num%2==0){
                condition=true;
                System.out.println("number is even");
            }
            if(num%2!=0){
                System.out.println("Number is odd");
            }
        }
        @SuppressWarnings("ConstantValue")
        public void checkIfAdult() {
            int age = 18;
            boolean condition = age>=18;
            if(condition){
                System.out.println("You are adult");
            }else {
                System.out.println("You are not adult");
            }
        }
    }
}































