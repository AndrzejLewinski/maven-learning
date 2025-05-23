package org.example.learning.utils.validation;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class ValidationUtils {

    private static final Logger logger = LoggerFactory.logger(ValidationUtils.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

         ValidationUtils validationUtils = new ValidationUtils();
         validationUtils.printMenu();


    }

    public void printMenu() {
        final String RESET = "\033[0m";
        final String DARK_GREEN = "\033[38;5;22m";
        final String BRIGHT_GREEN = "\033[38;5;82m";
        final String LIME = "\033[38;5;118m";
        final String OLIVE = "\033[38;5;28m";
        final String LEAF = "\033[38;5;40m";
        final String TITLE_COLOR = "\033[38;5;46m";

        String line = DARK_GREEN + "+--------------------------------------------------------------------+" + RESET;
        System.out.println(line);
        System.out.println("|          🍃🌿🍀      " + TITLE_COLOR + "ValidationUtils Menu" + TITLE_COLOR + "      🍃🌿🍀            " + DARK_GREEN + "||" + RESET);
        System.out.println(line);
        System.out.println("|      🍋  " + BRIGHT_GREEN + "This class provides methods for input validation:" + BRIGHT_GREEN + "  " + "🍋    " + DARK_GREEN + "||" + RESET);
        System.out.println(DARK_GREEN + "|                                                                   ||" + RESET);
        System.out.printf(DARK_GREEN + "| %-35s | %-27s ||\n", LEAF + "🔧 Method" + RESET, OLIVE + "📄 Description" + RESET);
        System.out.println(DARK_GREEN + "+-----------------------------------+--------------------------------+" + RESET);
        System.out.printf("| %-35s | %-27s ||\n", "🔢 readInteger(Scanner)", "reads any integer");
        System.out.printf("| %-35s | %-27s ||\n", "🔼 readPositiveInt(Scanner)", "reads positive integer (>0)");
        System.out.printf("| %-35s | %-27s ||\n", "🚫 readDivisor(Scanner)", "reads integer != 0");
        System.out.printf("| %-34s | %-27s ||\n", "✅ readBoolean(Scanner)", "reads boolean (true/false)");
        System.out.printf("| %-34s | %-27s ||\n", "➗ readDouble(Scanner)", "reads decimal number");
        System.out.printf("| %-35s | %-27s ||\n", "🎯 readIntInRange(Scanner,min,max)", "reads int within range");
        System.out.printf("| %-35s | %-27s ||\n", "📝 readNonEmptyString(Scanner)", "reads non-empty string");
        System.out.println(line);
        System.out.println(DARK_GREEN + "| ✅ " + LIME + "To use these methods, create a Scanner object, then        " + DARK_GREEN + "    ||" + RESET);
        System.out.println(DARK_GREEN + "| 💬 " + LEAF + "Call them like:                                           " + DARK_GREEN + "     ||" + RESET);
        System.out.println(OLIVE + "| int num = ValidationUtils.readInteger(scanner); 🚀" + DARK_GREEN + "                ||" + RESET);
        System.out.println(line);
    }


    @SuppressWarnings("CommentedOutCode")
    private void exercise() {

        // TODO: Uncomment these method calls when input validation exercises are enabled
        //Scanner scanner = new Scanner(System.in);
        // Your method calls

        // int number = readInteger(scanner);
        // int number2 = readPositiveInt(scanner);
        // int number3 = readDivisor(scanner);
        // boolean condition = readBoolean(scanner);
        // double doubleNumber = readDouble(scanner);
        // int number4 = readIntInRange(scanner,4,5);
        // String string = readNonEmptyString(scanner);


    }



    public String readNonEmptyString(Scanner scanner) {
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

    public int readIntInRange(Scanner scanner, int min, int max) {
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

    public double readDouble(Scanner scanner) {
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

    public boolean readBoolean(Scanner scanner) {
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

    public int readDivisor(Scanner scanner){
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

    public int readPositiveInt(Scanner scanner){
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

    public int readInteger(Scanner scanner){
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
