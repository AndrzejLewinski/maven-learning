package org.example.learning.essentials.extremeeasy.IntroductionToJava.ComparisonOperators;
import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


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


    }

    @SuppressWarnings("unused")
    private void reversingNumber() {
        ComparisonOperators comparisonOperators = new ComparisonOperators();
        int n = 12345;
        System.out.println(n);
        int m = comparisonOperators.reverseIntegerNumber(n);
        System.out.println(m);
    }

    private int reverseIntegerNumber(int number) {
        String string = String.valueOf(number);
        char[] digits = string.toCharArray();
        char[] reversed  = new char[digits.length];
        for(int i =0;i<digits.length;i++){
            reversed[i]=digits[digits.length-i-1];
        }
        int reversedNumber = 0;
        for(int i =0;i<reversed.length;i++){
            reversedNumber = (int) (reversedNumber+ (reversed.length-i)*Math.pow(10,reversed.length-i-1));
        }
        return reversedNumber;
    }

    @SuppressWarnings("unused")
    private void reverseString2() {
        //declaring number
        int number = 12345;
        //printing number
        System.out.println(number);

        String string = String.valueOf(number); //applying n number to string object
        char[] charArray = string.toCharArray(); //converting string to char array
        //noinspection ForLoopReplaceableByForEach
        for(int i =0;i<charArray.length;i++){
            System.out.print(charArray[i]+" ");  //printing characters from char array
        }
        System.out.println();
        for(int i =charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]+" ");  //printing characters from char array
        }
        System.out.println();
        char[] reversed  = new char[charArray.length]; //creating new char array
        for(int i =0;i<charArray.length;i++){
            reversed[i]=charArray[charArray.length-i-1]; // applying numbers to new char array named reversed
            System.out.print(reversed[i]+" ");
        }
        System.out.println();
        int reversedNumber = 0;
        for(int i =0;i<reversed.length;i++){
            //reversing number
            reversedNumber = (int) (reversedNumber+ (reversed.length-i)*Math.pow(10,reversed.length-i-1));
            // System.out.print(reversed[i]+" "); //we're testing if reversed array works
            System.out.print(reversedNumber+" ");
        }
        System.out.println();
        System.out.println(reversedNumber);
    }

    @SuppressWarnings("unused")
    private void reverseString() {
        int n = 123456;
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append(n).reverse().toString();
        System.out.println(n+" -> +"+string);
    }

    @SuppressWarnings("unused")
    private void searchingForPrimeNumbers2() {
        ComparisonOperators comparisonOperators = new ComparisonOperators();
        comparisonOperators.searchingForPrimeNumbers();
        /// ____________________________________________________________///
        /// --------------*** Searching for Prime Numbers ***------------
        for(int i =0;i<100;i++){
            if(isPrime(i)){
                PrintUtils.printThreeVarAnimations(" ",i," ");
            }
        }
        System.out.println();
        PrintUtils.printThreeVarAnimations("🎉","All prime numbers found!","");
    }

    private void searchingForPrimeNumbers() {
        final String[] frames = {"", ".", "..", "..."};
        final int timeout = 220;
        String input = "🔎 Searching for prime numbers from 0 to 99";
        final int repetitions = 2;
        final int dotsAfter = 1;
        for (int i = 0; i < repetitions; i++) {
            for (String frame : frames) {
                try {
                    System.out.print("\r" + input + frame);
                    TimeUnit.MILLISECONDS.sleep(timeout);
                } catch (InterruptedException e) {
                    System.err.println("Animation interrupted");
                    return;
                }
            }
        }
        for (int i = 0; i < dotsAfter; i++) {
            try {
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(timeout);
            } catch (InterruptedException e) {
                System.err.println("Animation interrupted");
                return;
            }
        }
        System.out.println();
    }

    private boolean isPrime(int number) {
        if(number<=1){
            return false; //just returning false, without using any booleans
        }
        int limit = (int) Math.sqrt(number);
        for(int i = 2; i<= limit;i++){
            if(number%i==0){
                return false; //just returning false, without using any booleans
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
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
                System.out.println("🍀 Congratulations 🍀 You have guessed the number.");
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
                    System.out.println("Congratulations! You have guessed the number.");
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
