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

    private static Logger logger = LoggerFactory.logger(LogicalOperatorsInJava.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        new LogicalOperatorsInJava().exercise();

    }

    private void exercise() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = readPositiveInt(scanner);

    }

    private int readPositiveInt(Scanner scanner){
        int result = 0;
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
        int result = 0;
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
