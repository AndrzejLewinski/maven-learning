package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class LogicalOperatorsInJava {

    private static final Logger logger = LoggerFactory.logger(LogicalOperatorsInJava.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        new LogicalOperatorsInJava().exercise();

    }

    @SuppressWarnings("CommentedOutCode")
    private void exercise() {

        Scanner scanner = new Scanner(System.in);
        // TODO: Uncomment these method calls when input validation exercises are enabled
        // int number = readInteger(scanner);
        // int number2 = readPositiveInt(scanner);
        // int number3 = readDivisor(scanner);




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
