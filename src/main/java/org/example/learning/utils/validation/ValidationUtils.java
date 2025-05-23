package org.example.learning.utils.validation;

import org.example.learning.utils.animations.launcher.AnimationLauncher;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Helper class for input validation in console applications.
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class ValidationUtils {

    private static final Logger logger = Logger.getLogger(ValidationUtils.class.getName());

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runHerbalLeaf();
        printMenu();
        Scanner scanner = new Scanner(System.in);
    }

    public static String isValidStringFromThreeOptions(Scanner scanner, String role1, String role2, String role3){
        String input;
        while (true){
            System.out.println("Enter your role ("+role1+","+role2+","+role3+")");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase(role1) || input.equalsIgnoreCase(role2) || input.equalsIgnoreCase(role3)){
                return input.toLowerCase();
            }else {
                System.out.println("Print proper role "+role1+"/"+role2+"/"+role3);
            }
        }
    }

    /**
     * Reads any integer from user input.
     */
    public static int readInteger(Scanner scanner) {
        System.out.println("Enter integer number: ");
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("This is not a number. Enter a valid number: ");
            }
        }
    }

    /**
     * Reads a positive integer (> 0) from user input.
     */
    public static int readPositiveInt(Scanner scanner) {
        System.out.println("Enter positive integer number: ");
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int result = Integer.parseInt(input);
                if (result > 0) {
                    return result;
                } else {
                    System.out.println("Number must be positive. Please enter number greater than zero: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not a number. Enter a valid number: ");
            }
        }
    }

    /**
     * Reads an integer different from zero.
     */
    public static int readDivisor(Scanner scanner) {
        System.out.println("Enter integer number different than zero: ");
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int result = Integer.parseInt(input);
                if (result == 0) {
                    System.out.println("You can't divide by zero. Please enter a number different than zero: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not a number. Enter a valid number: ");
            }
        }
    }

    /**
     * Reads a boolean value (true/false) from user input.
     */
    public static boolean readBoolean(Scanner scanner) {
        System.out.println("Enter boolean value (true/false): ");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if ("true".equals(input)) {
                return true;
            } else if ("false".equals(input)) {
                return false;
            } else {
                System.out.println("This is not a boolean value. Please enter 'true' or 'false': ");
            }
        }
    }

    /**
     * Reads a floating-point number from user input.
     */
    public static double readDouble(Scanner scanner) {
        System.out.println("Enter a decimal number (e.g., 3.14): ");
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("This is not a valid decimal number. Please try again: ");
            }
        }
    }

    /**
     * Reads an integer within the specified range [min, max].
     */
    public static int readIntInRange(Scanner scanner, int min, int max) {
        System.out.printf("Enter integer number between %d and %d:%n", min, max);
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int result = Integer.parseInt(input);
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

    /**
     * Reads a non-empty string from user input.
     */
    public static String readNonEmptyString(Scanner scanner) {
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

    /**
     * Prints a colorful menu explaining the available validation methods.
     */
    public static void printMenu() {
        final String RESET = "\033[0m";
        final String DARK_GREEN = "\033[38;5;22m";
        final String BRIGHT_GREEN = "\033[38;5;82m";
        final String LIME = "\033[38;5;118m";
        final String OLIVE = "\033[38;5;28m";
        final String LEAF = "\033[38;5;40m";
        final String TITLE_COLOR = "\033[38;5;46m";

        String line = DARK_GREEN + "+--------------------------------------------------------------------+" + RESET;
        System.out.println(line);
        System.out.println("|          🍃🌿🍀      " + TITLE_COLOR + "ValidationUtils Menu" + RESET + "      🍃🌿🍀            " + DARK_GREEN + "||" + RESET);
        System.out.println(line);
        System.out.println("|      🍋  " + BRIGHT_GREEN + "This class provides methods for input validation:" + RESET + "  " + "🍋    " + DARK_GREEN + "||" + RESET);
        System.out.println(DARK_GREEN + "|                                                                   ||" + RESET);
        System.out.printf(DARK_GREEN + "| %-35s | %-27s ||%n", LEAF + "🔧 Method" + RESET, OLIVE + "📄 Description" + RESET);
        System.out.println(DARK_GREEN + "+-----------------------------------+--------------------------------+" + RESET);
        System.out.printf("| %-35s | %-27s ||%n", "🔢 readInteger(Scanner)", "reads any integer");
        System.out.printf("| %-35s | %-27s ||%n", "🔼 readPositiveInt(Scanner)", "reads positive integer (>0)");
        System.out.printf("| %-35s | %-27s ||%n", "🚫 readDivisor(Scanner)", "reads integer != 0");
        System.out.printf("| %-34s | %-27s ||%n", "✅ readBoolean(Scanner)", "reads boolean (true/false)");
        System.out.printf("| %-34s | %-27s ||%n", "➗ readDouble(Scanner)", "reads decimal number");
        System.out.printf("| %-35s | %-27s ||%n", "🎯 readIntInRange(Scanner,min,max)", "reads int within range");
        System.out.printf("| %-35s | %-27s ||%n", "📝 readNonEmptyString(Scanner)", "reads non-empty string");
        System.out.printf("| %-36s | %-27s ||%n", "3️⃣ isValidStringFromThreeOptions", "user chooses from list");
        System.out.println(line);
        System.out.println(DARK_GREEN + "| ✅ " + LIME + "To use these methods, create a Scanner object, then        " + DARK_GREEN + "    ||" + RESET);
        System.out.println(DARK_GREEN + "| 💬 " + LEAF + "Call them like:                                           " + DARK_GREEN + "     ||" + RESET);
        System.out.println(OLIVE + "| int num = ValidationUtils.readInteger(scanner); 🚀" + DARK_GREEN + "                ||" + RESET);
        System.out.println(line);
    }
}
