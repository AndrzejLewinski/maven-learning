package org.example.learning.essentials.extremeeasy.IntroductionToJava.DefaultClass;

import org.example.animations.ResultAnimations;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class DefaultClass {



    private static final Logger logger = LoggerFactory.logger(DefaultClass.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runDots();
        ResultAnimations.herbalLeaf("(counting boolean value), result is: ",true);
        boolean isPartialSuccess = true;
        @SuppressWarnings("ConstantValue")
        String message = isPartialSuccess ? "⚠️ logic partially passed" : "✅ test passed";
        ResultAnimations.dotsAnimation(message, "");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");
        ///
    }


    @SuppressWarnings("CommentedOutCode")
    private void exercise() {

        Scanner scanner = new Scanner(System.in);
        // Your method calls

        // TODO: Uncomment these method calls when input validation exercises are enabled
        // int number = readInteger(scanner);
        // int number2 = readPositiveInt(scanner);
        // int number3 = readDivisor(scanner);
        // boolean condition = readBoolean(scanner);
        // double doubleNumber = readDouble(scanner);
        // int number4 = readIntInRange(scanner,4,5);
        // String string = readNonEmptyString(scanner);


    }



    private String readNonEmptyString(Scanner scanner) {
        System.out.println("Enter a non-empty string: ");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid string: ");
            } else {
                return input;
            }
        }
    }

    private int readIntInRange(Scanner scanner, int min, int max) {
        System.out.printf("Enter integer number between %d and %d:%n", min, max);
        int result;
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                result = Integer.parseInt(input);
                if (result >= min && result <= max) {
                    return result;
                } else {
                    System.out.printf("Number must be between %d and %d. Please try again: %n", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not a valid integer. Please enter a valid number: ");
            }
        }
    }

    private double readDouble(Scanner scanner) {
        System.out.println("Enter a decimal number (e.g., 3.14): ");
        double result;
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                result = Double.parseDouble(input);
                return result;
            } catch (NumberFormatException e) {
                System.out.println("This is not a valid decimal number. Please try again: ");
            }
        }
    }

    private boolean readBoolean(Scanner scanner) {
        System.out.println("Enter boolean value (true/false): ");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true")) {
                return true;
            } else if (input.equals("false")) {
                return false;
            } else {
                System.out.println("This is not a boolean value. Please enter 'true' or 'false': ");
            }
        }
    }

    private int readDivisor(Scanner scanner){
        System.out.println("Enter integer number different than zero: ");
        int result;
        while (true){
            try{
                String string = scanner.nextLine();
                result = Integer.parseInt(string);
                if (result == 0) {
                    System.out.println("You can't divide by zero. Please enter number different than zero: ");
                } else {
                    return result;
                }
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
    }

    private int readPositiveInt(Scanner scanner){
        System.out.println("Enter positive integer number: ");
        int result;
        while (true){
            try{
                String string = scanner.nextLine();
                result = Integer.parseInt(string);
                if(result>0){
                    return result;
                }else {
                    System.out.println("Number must be positive. Please enter number greater than zero: ");
                }
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
    }

    private int readInteger(Scanner scanner){
        System.out.println("Enter integer number: ");
        int result;
        while (true){
            try{
                String string = scanner.nextLine();
                result = Integer.parseInt(string);
                return result;
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
    }



}
