package org.example.learning.essentials.extremeeasy;
import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
/**
 * Created by User on 22.05.2025
 */
public class BasicMathematicalOperations {

    private static final Logger logger = LoggerFactory.getLogger(BasicMathematicalOperations.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        BasicMathematicalOperations basicMathematicalOperations = new BasicMathematicalOperations();
        basicMathematicalOperations.basicMathOperations();
    }

    @SuppressWarnings("unused")
    private void basicMathOperations() {
        BasicMathematicalOperations b = new BasicMathematicalOperations();
        System.out.print("Enter the first number: ");
        int x = b.isValidNumber();
        System.out.print("Enter the second number (non-zero): ");
        int y = b.getNonZeroNumber();

        int z = x + y;
        int a = x - y;
        int d = x * y;
        int e = x % y;
        int f = (int) Math.pow(x, y);

        int sum = z + a + d + e + f;
        double avg = division(sum, 5);

        double c = 0;
        try {
            c = b.division(x, y);
        } catch (ArithmeticException e1) {
            System.out.println("Division by zero error!");
        }
        PrintUtils.printThreeVarAnimations("Result: [" + x + "] +", " [" + y + "] = ", "[" + z + "]\n");
        PrintUtils.printThreeVarAnimations("Result: [" + x + "] -", " [" + y + "] = ", "[" + a + "]\n");
        PrintUtils.printThreeVarAnimations("Result: [" + x + "] *", " [" + y + "] = ", "[" + d + "]\n");
        PrintUtils.printThreeVarAnimations("Result: [" + x + "] %", " [" + y + "] = ", "[" + e + "]\n");
        PrintUtils.printThreeVarAnimations("Result: [" + x + "] ^", " [" + y + "] = ", "[" + f + "]\n");
        PrintUtils.printThreeVarAnimations("Result: [" + x + "] /", " [" + y + "] = ", "[" + c + "]\n");

        if (isEven(x)) {
            PrintUtils.printThreeVarAnimations("Number [" + x + "] is", " [even", "]\n");
        } else {
            PrintUtils.printThreeVarAnimations("Number [" + x + "] is", " [odd", "]\n");
        }

        PrintUtils.printThreeVarAnimations("Average of the results of addition, subtraction, " +
                "multiplication, modulus, and exponentiation = ", "[" + avg + "]", "\n");
    }


    private boolean isEven(int n){
        return n % 2 == 0;
    }

    private double division(int a, int b){
        if(b==0){
            throw new ArithmeticException("You can't divide by zero");
        }
        return (double) a/b;
    }
    private int getNonZeroNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                String string = scanner.nextLine();
                number = Integer.parseInt(string);
                if (number != 0) {
                    break;
                } else {
                    System.out.println("Zero is not allowed. Please enter a number different from zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return number;
    }
    @SuppressWarnings("unused")
    private int addition(int a, int b){
        return a+b;
    }
    private int isValidNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true){
            try{
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                break;
            }catch (NumberFormatException e){
                System.out.println("This is not a valid number. Enter a valid number: ");
            }
        }
        return number;
    }
}
