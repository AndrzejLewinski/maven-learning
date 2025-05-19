package org.example.learning.LightPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by User on 19.05.2025
 */
public class LightPractice {

    private static final Logger logger = LoggerFactory.getLogger(LightPractice.class);

    public static void main(String[] args) {

        LightPractice lp = new LightPractice();
        lp.logProgramStart();

        lp.testTheLargestIntegerFromThreeNumbers();


    }

    @SuppressWarnings("unsed")
    private void testTheLargestIntegerFromThreeNumbers(){
        LightPractice lp = new LightPractice();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<3;i++){
            int a = ThreadLocalRandom.current().nextInt(100);
            int b = ThreadLocalRandom.current().nextInt(100);
            int c = ThreadLocalRandom.current().nextInt(100);
            list.add(lp.theLargestIntegerFromThreeNumbers(a,b,c));
            System.out.println(a+" "+b+" "+c);
        }
        System.out.println();
        list.forEach(i-> System.out.print(i+" "));
        System.out.println("\n||----||");
    }

    @SuppressWarnings("unused")
    private int theLargestIntegerFromThreeNumbers(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }

    @SuppressWarnings("unused")
    private int theLargestIntegerFromThreeNumbers2(int a, int b, int c) {
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else return c;
    }


    @SuppressWarnings("unused")
    private boolean isEvenAndDivisible(int number) {
        if(number%3==0 && number%2==0){
            return true;
        }return false;
    }


    @SuppressWarnings("unused")
    private int positiveInput(Scanner scanner){
        System.out.println("Enter positive number: ");
        int number = -1;
        while (number<=0){
            try{
                number = scanner.nextInt();
                if(number<=0){
                    System.out.println("Enter positive number: ");
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter a valid integer:");
                scanner.next();
            }
        }
        return number;
    }


    @SuppressWarnings("unused")
    private void bmiCalculator() {
        //while cm are less than zero then our client is unable to go outside the loop
        Scanner scanner = new Scanner(System.in);
        int weight =-1;
        int height_in_cm=-1;
        double height;
        double denominator;

        System.out.println("Enter your weight: ");

        //The user will remain in the loop until he enters a value greater than zero.
        while (weight<=0){
            try{
                weight = scanner.nextInt();
                if(weight<=0){
                    System.out.println("Weight must be greater than zero");
                }
            }catch (RuntimeException e){
                System.out.println("Please enter a valid integer number.");
                scanner.next();
            }
        }

        System.out.println("Enter your height in cm: ");

        while (height_in_cm<=0){
            try{
                height_in_cm = scanner.nextInt();
                if(height_in_cm<=0){
                    System.out.println("Height must be greater than zero");
                }
            }catch (RuntimeException e){
                System.out.println("Please enter a valid integer number.");
                scanner.next();
            }
        }
        height = (double) height_in_cm/100;
        denominator = Math.pow(height,2);
        double bmi = (double) weight/denominator;
        System.out.println("Your BMI equals: "+bmi);

        scanner.close();
    }

    @SuppressWarnings("unused")
    private void tree() {
        for(int i =0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("unused")
    private void localDatePrinting() {

        //localTime.definedFormat(definedFormatter))
        //
        //
        //localTime -> ZonedDateTime localTime = new ZoneDateTime.now();
        //.format ->metoda format
        //DateTimeFormatter.ofPatter() ->introduce local variable
        //full pattern <<||   yyyy-MM-dd HH:mm:ss.SSS Z   ||>>

        ZonedDateTime localDate = ZonedDateTime.now();
        List<String> list = Arrays.asList("yyyy-MM-dd HH:mm:ss.SSS Z", "yyyy-MM-dd HH:mm:ss Z", "yyyy-MM-dd HH:mm Z",
                                            "yyyy-MM-dd HH Z", "yyyy-MM-dd Z");
        //
        String string = "Andrzej || <<  ";
        Stream<String> stringStream =
                list.stream().map(formats ->string+ localDate.format(DateTimeFormatter.ofPattern(formats))+" >>");
        stringStream.forEach(System.out::println);
    }

    private void logProgramStart(){
       logger.info("Program execution started");
    }


    @SuppressWarnings("unused")
    private void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String string = scanner.nextLine();
        System.out.println(string);
        scanner.close();
    }

    @SuppressWarnings("unused")
    private void factorialTest() {
        LightPractice lp = new LightPractice();
        for(int i =1;i<7;i++){
            System.out.println(lp.factorial(i));
        }
    }

    public int factorial(int n){
        if(n==0){
            return 1;
        }return n * factorial(n-1);
    }

    public int add(int a, int b){
        return a+b;
    }

    @SuppressWarnings("unused")
    private void greet(String name){
        System.out.println("Hey, "+name);
    }

    @SuppressWarnings("unused")
    private void forLoop(int n){
        for(int counter =1;counter<=n;counter++){
            System.out.print(counter+" ");
        }
        System.out.println();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
    }

    @SuppressWarnings("unused")
    private static void ageCoclusions(int n){
        if (n == 16) {
            System.out.println("It's time to make a driving licence");
        } else if (n >= 18) {
            System.out.println("Adult");
        }else {
            System.out.println("There are no conclusions for this year of your age in this particular program");
        }
    }

    @SuppressWarnings("unused")
    private int sumFromOneToNumber(int n){
        int sum = 0;
        for(int counter =1; counter<=n; counter++){
            sum+=counter;
        }
        return sum;
    }
    @SuppressWarnings("unused")
    private boolean isLessThan100(int a, int b){
        return a<100 && b<100;
    }
    @SuppressWarnings("unused")
    private boolean ifGreater(int a, int b){
        return a>b;
    }
    @SuppressWarnings("unused")
    private void addition(int a, int b){
        System.out.println(a+b);
    }
    @SuppressWarnings("unused")
    private void helloWorld() {
        logger.info("Programming is printing the text.");
        System.out.println("Hello World!");
    }

    @SuppressWarnings("unused")
    private void whatIsComputer() {

        logger.info("A computer is a machine that executes instructions contained in a program.");
        logger.info("Programming is the process of creating those instructions " +
                "that allow the computer to solve problems.");
        logger.info("A programming language is a tool that allows the programmer " +
                "to communicate with the computer by giving it commands.");
        logger.info("Below is an example of the simplest program in Java that displays text on the screen.");
        System.out.println("Welcome to the world of programming! This is the simplest program that can print text.");

    }


}
