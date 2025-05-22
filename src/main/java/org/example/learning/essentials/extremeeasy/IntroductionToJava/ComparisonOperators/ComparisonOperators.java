package org.example.learning.essentials.extremeeasy.IntroductionToJava.ComparisonOperators;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by User on 22.05.2025
 */
public class ComparisonOperators {
    private static final Logger logger = LoggerFactory.getLogger(ComparisonOperators.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();
        ComparisonOperators comparisonOperators = new ComparisonOperators();
        comparisonOperators.MultiplicationTable();

    }

    private void MultiplicationTable() {
        int tableLength = 10;
        for(int i = 0; i < tableLength; i++){
            for(int j =0; j < tableLength; j++){
                int number = i*j;
                if(number==0){
                    System.out.print("__ ");
                }else if(number<10){
                    System.out.print(" "+number+" ");
                }else {
                    System.out.print(j*i+" ");
                }
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private void GettingWarmerColder() {

        Random random = new Random();
        //Losujemy liczbę
        int randomNumber = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number in range from 1 to 100 : ");
        //user wczytuje liczbę
        boolean isValid = true;
        do{
            int x = readNumberBetweenRange(scanner,1,100);

            //noinspection IfStatementWithTooManyBranches
            if(Math.abs(randomNumber-x)>35){
                System.out.println("🧊🧊🧊🧊🧊");
            }else if(Math.abs(randomNumber-x)>25){
                System.out.println("🧊🧊🧊🧊");
            }else if(Math.abs(randomNumber-x)>5){
                System.out.println("🧊🧊🔥");
            }else if(Math.abs(randomNumber-x)>2){
                System.out.println("🔥🔥");
            }else if(Math.abs(randomNumber-x)>1){
                System.out.println("🔥");
            }


            if(x == randomNumber){
                System.out.println("🍀 Contratulations 🍀 You have guessed the number.");
                isValid=false;
            }
        }while (isValid);
    }

    @SuppressWarnings("unused")
    private void exercise2() {
        Random random = new Random();
        //Losujemy liczbę
        int randomNumber = random.nextInt(5)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number in range from 1 to 5 : ");
        //user wczytuje liczbę

        boolean isValid = true;

        while (isValid){
            int x = readNumberBetweenRange(scanner,1,5);
                if(x == randomNumber){
                    System.out.println("Contratulations! You have guessed the number.");
                    isValid=false;
                }
        }
        System.out.println("Random number was: "+randomNumber);
    }

    @SuppressWarnings("unused")
    private void exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = readValidInt(scanner);
        System.out.print("Enter the number: ");
        int y = readValidInt(scanner);

        if(x>y){
            System.out.println("x > y");
        }else if(x<y){
            System.out.println("x < y");
        }else{
            System.out.println("x = y");
        }
    }
    @SuppressWarnings("SameParameterValue")
    private int readNumberBetweenRange(Scanner scanner, int lowerBound, int upperBound){
        int result = 0;
        boolean isValid = true;
        while (isValid){
            try{
                String input = scanner.nextLine();
                result = Integer.parseInt(input);
                if(result>=lowerBound && result<=upperBound){
                    isValid=false;
                }else {
                    System.out.println("✖ Number must be between "+lowerBound+" and "+upperBound);
                }
            }catch (NumberFormatException e){
                System.out.println("❌ This is not a number. Enter valid number: ");
            }
        }
        return result;
    }

    private int readValidInt(Scanner scanner){
        int result = 0;
        boolean isValid = true;
        while (isValid){
            try{
                String input = scanner.nextLine();
                result = Integer.parseInt(input);
                isValid=false;
            }catch (NumberFormatException e){
                System.out.println("❌ This is not a number. Enter valid number: ");
            }
        }
        return result;
    }





}
