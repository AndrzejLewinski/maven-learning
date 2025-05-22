package org.example.learning.essentials.extremeeasy;
import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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


    }

    @SuppressWarnings("unused")
    private void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits and convert to an array: ");
        int number = scanner.nextInt();

        int sum = 0;
        // Lista do przechowywania cyfr
        List<Integer> digitsList = new ArrayList<>();

        // Rozbijamy liczbę na cyfry
        while (number != 0) {
            int digit = number % 10;  // Pobieramy ostatnią cyfrę
            digitsList.add(digit);     // Dodajemy cyfrę do listy
            sum += digit;              // Dodajemy cyfrę do sumy
            number /= 10;              // Usuwamy ostatnią cyfrę z liczby
        }

        // Teraz lista ma cyfry w odwrotnej kolejności, więc musimy je odwrócić
        Collections.reverse(digitsList);

        // Konwertujemy listę na tablicę
        int[] digitsArray = digitsList.stream().mapToInt(Integer::intValue).toArray();

        // Wyświetlamy wynik
        System.out.println("Tablica cyfr: " + Arrays.toString(digitsArray));
        System.out.println("Suma cyfr: " + sum);
    }


    @SuppressWarnings("unused")
    private void biggestNumber() {

        List<Integer> collect = IntStream.range(0, 20)
                .map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printIntegerWithSpace);
        List<Integer> collect1 = collect.stream().mapToInt(Integer::intValue).sorted().boxed().collect(Collectors.toList());
        PrintUtils.printEmptyLine();
        collect1.forEach(PrintUtils::printIntegerWithSpace);
        PrintUtils.printEmptyLine();

        int[] tab = new int[collect.size()];
        for(int i =0;i<tab.length;i++){
            tab[i] = collect.get(i);
            System.out.print(tab[i]+" ");
        }

        int max = Integer.MIN_VALUE;

        for (int k : tab) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println();
        System.out.println(max);

        for(int x : tab){
            PrintUtils.printIntegerWithSpace(x);
        }
        System.out.println();

        for(int i =0;i<=tab.length-1;i++){
            for(int j=0;j<=tab.length-2;j++){
                if(tab[j]>tab[j+1]){
                    int temp = tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                }
            }
        }
        for(int x : tab){
            PrintUtils.printIntegerWithSpace(x);
        }


    }

    @SuppressWarnings("unused")
    private void perfectNumber() {
        for(int number = 1; number<10000;number++){
            int sum = 0;
            for(int i =1;i<number;i++){
                if(number%i==0){
                    sum+=i;
                }
            }
            if(number==sum){
                System.out.println("Number: "+number+" is perfect");
            }
        }
    }

    @SuppressWarnings("unused")
    private void palindrom() {
        int number = 123454321;
        String string = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        //String reversed = String.valueOf(stringBuilder);
        String reversed = stringBuilder.toString();

        System.out.println(string + " "+reversed);
        if(string.equals(reversed)){
            System.out.println("palindrom");
        }else {
            System.out.println("is not palindrom");
        }

    }

    @SuppressWarnings("unused")
    private void evenNumbers() {
        List<Integer> collect = IntStream.range(0, 100).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printIntegerWithSpace);
    }


    @SuppressWarnings("unused")
    private void factorial() {
        int n = 1;
        int counter = 1;
        int number = 5;
        while (counter<=number){
            n=n*counter;
            System.out.print(n+" ");
            counter++;
        }
        System.out.println("Factorial of ("+number+") = "+n);
    }

    @SuppressWarnings("unused")
    private void reversingNumberMethodTwo() {
        int number = 123454321;
        String string = String.valueOf(number);
        char[] charArray = string.toCharArray();
        char[] reversedCharArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            reversedCharArray[i] = charArray[charArray.length - 1 - i];
        }

        for (char c : reversedCharArray) {
            System.out.print(c+" ");
        }
        System.out.println();

        boolean isPalindrome = true;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != reversedCharArray[i]) {
                isPalindrome = false;
                break;
            }
        }
        // Wynik
        if (isPalindrome) {
            System.out.println("Number " + number + " is a palindrome.");
        } else {
            System.out.println("Number " + number + " is not a palindrome.");
        }

    }


    @SuppressWarnings("unused")
    private void reversingNumberMethodOne() {

        int number = 12345;
        String string = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder reverse = stringBuilder.append(string).reverse();
        System.out.println(reverse);
        int reversedNumber = Integer.parseInt(String.valueOf(reverse));
        System.out.println(reversedNumber);


    }

    @SuppressWarnings("unused")
    private void isPrimeSmallTest(){
        for(int i =0;i<10;i++){
            System.out.println(i+" "+ reversingNumberMethodOne(i));
        }
    }

    @SuppressWarnings("unused")
    public boolean reversingNumberMethodOne(int number){
        boolean isPrime = number >= 2;
        for(int i =2;i<=(int)Math.sqrt(number);i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
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
