package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 22.05.2025
 */
@SuppressWarnings("unused")
public class IfElseStatements {


    private static final Logger logger = LoggerFactory.getLogger(IfElseStatements.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();
        IfElseStatements elseStatements = new IfElseStatements();
        elseStatements.smallTest();

    }

    private void smallTest() {

        for(int i =0;i<100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    private boolean isPrime(int number){
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is a prime number
        }
        if (number % 2 == 0) {
            return false; // All other even numbers are not prime
        }
        // Check divisibility from 3 up to the square root of the number, step by 2 (skip even numbers)
        // 3,5,7,9- is not prime,....,11,..15-is not prime ...
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void leapYear() {
        Scanner scanner = new Scanner(System.in);
        int year = isValid(scanner);
        boolean condition =  year % 400 == 0;
        boolean condition1 = year % 100 != 0;
        boolean condition2 = year %   4 == 0;

        //A year is a leap year if it is divisible by 400,
        //or if it is divisible by 4 and simultaneously not divisible by 100.
        boolean isLeapYear = condition || (condition1 && condition2);

        if(isLeapYear){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }

    private void leapYearHack() {
        Scanner scanner = new Scanner(System.in);
        int year = isValid(scanner);
        boolean condition =  year % 400 == 0;
        boolean condition1 = year % 100 == 0;
        boolean condition2 = year %   4 == 0;

        boolean isLeapYear = false;
        //if Year is divisible by 400
        if(condition){
            isLeapYear=true;
            //if Year is divisible by 100
        }else //noinspection StatementWithEmptyBody
            if(condition1){
        }else if(condition2){
            isLeapYear=true;
        }
        if(isLeapYear){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }

    }

    private void maxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = isValid(scanner);
        System.out.println("Enter number: ");
        int y = isValid(scanner);
        System.out.println("Enter number: ");
        int z = isValid(scanner);
        int max = Math.max(Math.max(x,y),z);
        System.out.println(max);
        System.out.println();
        int[] tab = {x,y,z};
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for(Integer element : tab){
            System.out.print(element+" ");
            if(element==max){
                counter++;
                list.add(element);
            }
        }
        System.out.println("counter = "+counter);
        boolean condition = counter > 1;
        if(condition){
            PrintUtils.printLine("The following numbers are equal and are the largest:");
            list.forEach(PrintUtils::printIntegerWithSpace);
            PrintUtils.printLine("\nThese numbers share the same maximum value.");
        }
    }

    private void isDividedByTwoAndByThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = isValid(scanner);
        boolean divisibleBySix = isDivisibleBySix(x);
        boolean evenNumber = isEvenNumber(x);
        boolean divisibleByThree = isDivisibleByThree(x);
        //noinspection IfStatementWithTooManyBranches
        if(divisibleBySix) {
            System.out.println("Number is divisible by two and by three");
        }else if(divisibleByThree){
            System.out.println("Number is divisible by three");
        }else if(evenNumber){
            System.out.println("Number is divisible by two");
        }else {
            System.out.println("Number is either not divisible by two or by three");
        }
    }

    private boolean isDivisibleBySix(int number){
        return number%6==0;
    }

    private boolean isDivisibleByThree(int number){
        return number%3==0;
    }
    private boolean isEvenNumber(int number){
        return number%2==0;
    }

    private void isGreaterThanTen() {
        Scanner scanner = new Scanner(System.in);
        int x = isValidExcludesZero(scanner); // Get user input
        compareWithAnotherNumbers(x,10); // Compare the input number with 10
    }

    @SuppressWarnings("SameParameterValue")
    private void compareWithAnotherNumbers(int a, int b){
        if(a > b){
            System.out.println("The number " + a + " is greater than the number " + b);
        } else {
            System.out.println("The number " + a + " is not greater than the number " + b);
        }
    }

    private int isValidPositive(Scanner scanner){
        int number = Integer.MIN_VALUE;
        boolean isValid = true;
        while (isValid){
            try{
                String inputString = scanner.nextLine();
                number = Integer.parseInt(inputString);
                if (number < 0) {
                    System.out.println("You must have positive value. Enter valid number: ");
                } else {
                    isValid = false;
                }
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException : This is not a number! Enter the number: ");
            }
        }
        return number;
    }

    private int isValidExcludesZero(Scanner scanner){
        int number = Integer.MIN_VALUE;
        boolean isValid = true;
        while (isValid){
            try{
                String inputString = scanner.nextLine();
                number = Integer.parseInt(inputString);
                if (number == 0) {
                    System.out.println("You can't divide by zero. Enter valid number: ");
                } else {
                    isValid = false;
                }
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException : This is not a number! Enter the number: ");
            }
        }
        return number;
    }

    @SuppressWarnings("unused")
    private int isValid(Scanner scanner){
        int number = Integer.MIN_VALUE;
        boolean isValid = true;
        while (isValid){
            try{
                String inputString = scanner.nextLine();
                number = Integer.parseInt(inputString);
                isValid=false;
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException : This is not a number! Enter the number: ");
            }
        }
        return number;
    }


}
