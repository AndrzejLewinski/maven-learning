package org.example.learning.essentials.IntroductionToJava.Exercises;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by User on 22.05.2025
 */
@SuppressWarnings("unused")
public class TernaryOperator {
    private static final Logger logger = LoggerFactory.getLogger(TernaryOperator.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();
        TernaryOperator ternaryOperator  = new TernaryOperator();

    }

    private void basics3() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter how many times you want to enter numbers in the loop in order to create data set: ");
    int number = isValid(scanner);

    int evenNumbers = 0;
    for(int i =0;i<number;i++){
        int numbers = isValid(scanner);
        //noinspection SimplifiableConditionalExpression
        boolean result = ((numbers % 2) == 0) ? true : false;
        if(result){
            evenNumbers++;
        }
    }
    int odd = number - evenNumbers;
    System.out.println("Even numbers: "+evenNumbers);
    System.out.println("Odd numbers: "+odd);
    }

    private void basics2() {
        Scanner scanner = new Scanner( System.in);
        System.out.print("Enter the number: ");
        int number = isValid(scanner);

        //noinspection NestedConditionalExpression
        String result = number == 0  ? "zero" : ( number > 0 ? "positive" : "negative");
        System.out.println(result);
    }


    private void basics() {
        Scanner scanner = new Scanner( System.in);
        System.out.print("Enter the number: ");
        int number = isValid(scanner);

        String result = (number % 2 == 0) ? "Even" : "Odd";
        //System.out.println(number + " is an" + result + " number");
        PrintUtils.printThreeVarAnimations(number, " is an ", result.toLowerCase()+" number.");
        scanner.close();
    }

    private int isValid(Scanner scanner){
        int result = 0;
        boolean isValid = true;
        while (isValid){
            try {
                String string = scanner.nextLine();
                result = Integer.parseInt(string);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
        return result;
    }

}
