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

        bubbleSortingLesson();

    }

    private static void bubbleSortingLesson() {
        List<Integer> collect =
                IntStream.range(0, 20).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        int[] tab = new int[20];
        for(int i = 0; i < collect.size(); i++ ){
            tab[i] = collect.get(i);
            System.out.print(tab[i] + " ");
        }
        for(int n = 1; n < tab.length; n++) {
            // Loop through the array from tab[0] to tab[n-1]
            for(int i = 0; i < tab.length - 1; i++) {
                // If the number on the left is greater than the one on the right
                if(tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    // The number on the left takes the smaller value from the right number
                    tab[i] = tab[i + 1];
                    // The number on the right takes the larger value from the left number
                    tab[i + 1] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }


    private static void reversedString() {
        List<Integer> collect =
                IntStream.range(0, 20).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> collect1 = collect.stream().sorted().collect(Collectors.toList());
        collect1.forEach(i-> System.out.print(i+" "));
        System.out.println();

        int[] tab = new int[20];

        int sum = 0;

        for(int i = 0; i < collect.size(); i++ ){
            tab[i] = collect.get(i);
            System.out.print(tab[i]+" ");
            sum+=tab[i];
        }
        System.out.println();
        System.out.println("sum = "+sum+"\n");

        int n = tab.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        Arrays.stream(tab).mapToObj(j -> j + " ").forEach(System.out::print);

        System.out.println();

        for(int i = 0; i < collect.size(); i++ ){
            stringBuilder.append(collect.get(i));
            if( i < collect.size() - 1){
                stringBuilder.append("_");
            }
        }
        String string = stringBuilder.toString();
        //we're printing what we have done up till now
        System.out.println(string);
        String reversedString = stringBuilder.reverse().toString();
        System.out.println(reversedString);
    }

    @SuppressWarnings("unused")
    private void testForSumFunctionOnlyForPrimeNumbers(){
        LightPractice lp = new LightPractice();
        lp.sumForPrimeNumbers(3);
        System.out.println();
        lp.sumForPrimeNumbers(7);
    }

    private void sumForPrimeNumbers(int counter){
        LightPractice lp = new LightPractice();
        int sum = 0;
        for(int i = 0; i <= counter; i++){
            if(lp.ifPrimeNumber(i)){
                sum+=i;
                System.out.println(i + " " + lp.ifPrimeNumber(i)+" sum: "+sum);
            }
        }
        System.out.println("sum = "+sum);
    }
    private boolean ifPrimeNumber(int number){
        int sqrtNumber = (int) Math.sqrt(number);
        boolean isPrimeNumber = true;
        if(number<=1){
            return false;
        }
        int i =2;
        while (i<=sqrtNumber) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
            i++;
        }
        return isPrimeNumber;
    }

    @SuppressWarnings("unused")
    private void quickRepetitionOne() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss:SS")));
    }

    public double triangleArea(int base, int height){
        return (double) base*height*0.5;
    }

    public double circleArea(int radius){
        return Math.PI *radius*radius;
    }

    @SuppressWarnings("unused")
    private static void rectangleAreaVoid(int a, int b){
        System.out.println(a*b);
    }

    @SuppressWarnings("unused")
    private void whileFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        
        int number = -1;
        while (number<=0){
            try{
                number = scanner.nextInt();
                if(number<=0){
                    System.out.println("Please enter positive number: ");   
                }
            }catch (InputMismatchException e){
                System.out.println("This is not valid number, please enter the valid number: ");
                scanner.next();
            }
        }
        scanner.close();

        int counter = 1;
        int factorial = 1;
        while (counter<=number){
            System.out.println("n = "+counter+" factorial = "+factorial);
            counter++;
            factorial*=counter;
        }
    }

    @SuppressWarnings("unused")
    public void fibonacci(){
        //Expected result is : 0 1 1 2 3 5 8 13 21 34 55
        int number = 10;
        int a = 0;
        int b = 1;
        int next;
        for(int i =0;i<10;i++){
            next = a + b;
            a = b;
            b = next;
            System.out.print(a+" ");
        }
    }

    @SuppressWarnings("unused")
    public int returnFactorial(int n){
        if(n<0){
            throw new IllegalArgumentException("You should enter positive value to this method.");
        }
        if(n==0){
            return 1;
        }return n * returnFactorial(n-1);
    }

    /*
     * Program that evaluates the largest of the three numbers and display whether
     * the largest number is even or odd.
     */
    @SuppressWarnings("unused")
    private void evaluateTheLargestNumberAndCheckingIfTheNumberIsEvenOrOdd(int a, int b, int c){
        int max =Math.max(a,Math.max(b,c));
        boolean maxIsEven = max % 2 ==0;
        if(maxIsEven){
            System.out.println(max + " is even number.");
        }
        System.out.println(max + " is odd number.");
    }

    @SuppressWarnings("unused")
    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @SuppressWarnings("unused")
    private int theLargestIntegerFromThreeNumbers(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }

    /*
     * This method tests the function that finds the largest number
     * among three randomly generated numbers.
     * It prints the inputs and the result for each test case.
     */
    @SuppressWarnings("unused")
    private void testTheLargestIntegerFromThreeNumbers(){
        LightPractice lp = new LightPractice();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<3;i++){
            //  Generate three random integers between 0 and 99
            int a = ThreadLocalRandom.current().nextInt(100);
            int b = ThreadLocalRandom.current().nextInt(100);
            int c = ThreadLocalRandom.current().nextInt(100);
            list.add(lp.theLargestIntegerFromThreeNumbers(a,b,c));
            // Print the generated numbers
            System.out.println(a+" "+b+" "+c);
        }
        System.out.println();
        list.forEach(i-> System.out.print(i+" "));
        System.out.println("\n||----||");
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
        return number % 3 == 0 && number % 2 == 0;
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
            System.out.println(lp.returnFactorial(i));
        }
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
    private static void ageConclusions(int n){
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
