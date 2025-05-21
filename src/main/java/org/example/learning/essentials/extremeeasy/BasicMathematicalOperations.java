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
        System.out.print("Enter first number: ");
        int x = b.isValidNumber();
        System.out.print("Enter second number (different than zero): ");

        int y = b.getNonZeroNumber();
        int z = x + y;
        int a = x - y;
        int d = x * y;
        int e = x % y;
        int f = (int) Math.pow(x,y);

        //Średnia z wyników dodawania, odejmowania, mnożenia, znajdowania reszty z dzielenia, potęgowania
        int sum = z+a+d+e+f;
        double avg = division(sum,5);

        double c = b.division(x,y);
        PrintUtils.printThreeVarAnimations("Wynik: ["+x+"] +"," ["+y+"] = ","["+z+"]\n");
        PrintUtils.printThreeVarAnimations("Wynik: ["+x+"] -"," ["+y+"] = ","["+a+"]\n");
        PrintUtils.printThreeVarAnimations("Wynik: ["+x+"] *"," ["+y+"] = ","["+d+"]\n");
        PrintUtils.printThreeVarAnimations("Wynik: ["+x+"] %"," ["+y+"] = ","["+e+"]\n");
        PrintUtils.printThreeVarAnimations("Wynik: ["+x+"] ^"," ["+y+"] = ","["+f+"]\n");
        PrintUtils.printThreeVarAnimations("Wynik: ["+x+"] /"," ["+y+"] = ","["+c+"]\n");
        if (isEven(x)){
            PrintUtils.printThreeVarAnimations("Liczba ["+x+"] is"," [even","]");
        }else {
            PrintUtils.printThreeVarAnimations("Liczba ["+x+"] is"," [odd","]");
        }
        PrintUtils.printThreeVarAnimations("Średnia z wyników dodawania, odejmowania, " +
                "mnożenia, znajdowania reszty z dzielenia, potęgowania = ","["+avg+"]","\n");

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
