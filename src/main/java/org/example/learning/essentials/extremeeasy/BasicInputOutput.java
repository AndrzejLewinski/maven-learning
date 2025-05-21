package org.example.learning.essentials.extremeeasy;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by User on 21.05.2025
 */
public class BasicInputOutput {

    private static final Logger logger = LoggerFactory.getLogger(BasicInputOutput.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();
        new BasicInputOutput().enterYourName();
        new BasicInputOutput().exercises();

    }

    private void exercises() {
        String prompt1 = "Enter your name: ";
        String prompt2 = "Enter number a: ";
        String prompt3 = "Enter number b: ";
        String prompt4 = "Enter integer number: ";
        String numberA = "number a: ";
        String numberB = "number b: ";
        String output1 = ", sum(a+b) = a + b = ";
        Scanner scanner = new Scanner(System.in);
        PrintUtils.printLine(prompt1);
        String name = scanner.nextLine();
        PrintUtils.printThreeVarAnimations("Hey, ", name, "! \n");
        PrintUtils.printLine(prompt2);
        int a = isValidNumber(scanner);
        PrintUtils.printLine(prompt3);
        int b = isValidNumber(scanner);
        PrintUtils.printThreeVarAnimations(numberA + a + " ,", numberB + b, output1 + (a + b) + "\n");
        PrintUtils.printLine(prompt4);
        int c = isValidNumber(scanner);
        PrintUtils.printThreeVarAnimations("entered number n = " + c + ", n^2 = ", Math.pow(c, 2), "\n");
        PrintUtils.printLine(prompt2);
        a = isValidNumber(scanner);
        PrintUtils.printLine(prompt3);
        b = isValidNumber(scanner);
        compareTwoNumbers(a, b);
        PrintUtils.printLine(prompt4);
        c = isValidNumber(scanner);
        if (c % 2 == 0) {
            PrintUtils.printThreeVarAnimations("Entered number n = ", c, " is even number.");
        }
        PrintUtils.printThreeVarAnimations("Entered number n = ", c, " is even number.");
    }

    private void compareTwoNumbers(int a, int b){
        if(a>b){
            System.out.println("a > b");
        }else if(a<b){
            System.out.println("a < b");
        }else {
            System.out.println("a = b");
        }
    }

    private int isValidNumber(Scanner scanner){
        int number = 0;
        boolean valid = true;
        while (valid){
            try {
                String input = scanner.nextLine();
                number = Integer.parseInt(input); // parsujemy ręcznie
                valid = false;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number, write a valid number: ");
            }
        }
        return number;
    }

    @SuppressWarnings("unused")
    private void exerciseHelloWorld(){
        System.out.println("Hello World!");
    }

    @SuppressWarnings("unused")
    private void enterYourName(){
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        String name;
        while (condition){
            PrintUtils.printlnStringLine("Enter your name: ");
            name = scanner.nextLine();

            if(!name.isEmpty() && isStringContainsLettersOnly3(name)){
                condition=false;
            }else {
                System.out.println("This string does not contains letters only. Please enter valid name: ");
            }
        }
    }

    @SuppressWarnings("unsed")
    private static boolean isStringContainsLettersOnly3(String string){
        return string.chars().allMatch(c -> Character.isLetter(c) || c == ' ');
    }

    @SuppressWarnings("unused")
    private static boolean isStringContainsLettersOnly(String string){
        int counter = 0;
        char[] charArray = string.toCharArray();
        for(char c: charArray){
            if(Character.isLetter(c) || c==' '){
                counter++;
            }
        }
        return counter == string.length();
    }

    @SuppressWarnings("unused")
    private static boolean ifStringContainsLettersOnly1(String input){
        char[] charArray = input.toCharArray();
        for(char c : charArray){
            if(!Character.isLetter(c) && c !=' '){
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    private boolean isLetterOrSpace(char c){
        return Character.isLetter(c) || c == ' ';
    }

    @SuppressWarnings("unused")
    private void smallTests(){
        //char validation
        char procent = '%';
        PrintUtils.printlnObject(procent);
        PrintUtils.printlnObject(new BasicInputOutput().isLetterOrSpace(procent));
        PrintUtils.printlnObject(new BasicInputOutput().isLetterOrSpace('a'));

        String name = "Grzegorz";
        char[] charArray = name.toCharArray();
    }
}
