package org.example.learning.essentials.extremeeasy.IntroductionToJava;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by User on 22.05.2025
 */
public class SwitchBasicStatements {


    private static final Logger logger = LoggerFactory.getLogger(SwitchBasicStatements.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        SwitchBasicStatements switchBasicStatements = new SwitchBasicStatements();
        switchBasicStatements.daysOfWeek();

    }

    private void daysOfWeek() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number between 1 and 7 ");
    int number = isValidNumber(scanner);
    String result = switch (number){
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> throw new IllegalStateException("Unexpected value: " + number);
    };
    System.out.println(result);
    }

    private int isValidNumber(Scanner scanner){
        boolean isValid = true;
        int number = 0;
        while (isValid){
             try{
                String string = scanner.nextLine();
                number = Integer.parseInt(string);
                isValid=false;
             }catch (NumberFormatException e){
                 System.out.println("This is not a number. Enter valid number: ");
             }
        }
        return number;
    }






















    @SuppressWarnings("unused")
    private void switchExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want red, green or blue pencil ? ");
        String string =scanner.nextLine();
        String result = switch (string){
          case "red" -> "...you have chosen red, good choice";
          case  "blue"->"...it is very good you have chosen blue color";
          case "green"->"...it is perfect that you have chosen green";
          default -> "I believe that next time you will choose between these three colors";

        };
        System.out.println(result);
    }

    @SuppressWarnings("unused")
    private void switchOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to eat avocado or cucumber ? ");
        String choice = scanner.nextLine();
        String result = switch (choice) {
            case "avocado" -> "You have chosen avocado";
            case "cucumber" -> "You have chosen cucumber";
            default -> "This is either not cucumber or avocado.";
        };
        System.out.println(result);
    }

    @SuppressWarnings("unused")
    private void defaultSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to eat avocado or cucumber ? ");
        String choice = scanner.nextLine();
        String result;
        switch (choice){
            case "avocado":
                result = "You have chosen avocado";
                break;
            case "cucumber":
                result = "You have chosen cucumber";
                break;
            default:
                result = "This is either not cucumber or avocado.";
        }
        System.out.println(result);
    }

}
