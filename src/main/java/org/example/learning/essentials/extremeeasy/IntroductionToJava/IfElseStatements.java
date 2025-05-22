package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by User on 22.05.2025
 */
public class IfElseStatements {


    private static final Logger logger = LoggerFactory.getLogger(IfElseStatements.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();
        IfElseStatements elseStatements = new IfElseStatements();
        elseStatements.isGreaterThanTen();
    }

    private void isGreaterThanTen() {
        Scanner scanner = new Scanner(System.in);
        int x = isValidExcludesZero(scanner);
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
