package org.example.learning.essentials.OOP.stack.speedruns;
import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by User on 27.05.2025
 */
public class SpeedrunOne {

    private static final Logger logger = LoggerFactory.getLogger(SpeedrunOne.class);


    /// class Car
    private static class Car{
        String model;
        void printModel(){
            System.out.println(model);
        }
        public Car(String model) {
            this.model = model;
        }

        public Car() {
        }

        public static Car createCar(String model){
            return new Car(model);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }

        private static void printModel(Car car){
            System.out.println(car);
        }


        public static void output(){
            Car car1 = Car.createCar("Mustang");
            Car car2 = Car.createCar("Multipla");
            car1.printModel();
            car2.printModel();
        }
    }

    /// class Book

    private static class Book{

        private String title;
        private int pages;

        public Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }

    private abstract static class Vehicle{
        String brand;
    }

    private static class Bike extends Vehicle{
        private void ringBell(){
            logger.info("ring bell!");
        }
    }

    private static class Shape{
        void draw(){
            System.out.println("Draw Shape");
        }
    }
    private static class Circle extends Shape{
        @Override
        void draw() {
            super.draw();
            System.out.println("Draw Circle\n");
        }
    }
    private static class Square extends Shape{
        @Override
        void draw() {
            super.draw();
            System.out.println("Draw Square\n");
        }
    }

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");

        division();

        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }

    private static void division() {
        Scanner scanner = new Scanner(System.in);
        int x = readInteger(scanner);
        int y = readingDivisor(scanner);
        double result = divide(x,y);
        System.out.println(result);
    }

    private static double divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("You can't divide by zero");
        }return (double) a/b;
    }

    private static void map() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ada", 20);
        map.put("Anna", 21);
        map.put("Anastazja", 21);
        for(Map.Entry<String,Integer> eachName : map.entrySet()){
            System.out.println(eachName.getKey()+" "+eachName.getValue());
        }
    }

    private static void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("Ada");
        list.add("Anna");
        list.add("Anastazja");
        for(String eachName : list){
            System.out.println(eachName);
        }
    }

    private static void shapes() {
        new Circle().draw();
        new Square().draw();
    }

    private static void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

    }

    private static void car(){
       Car.output();
    }

    private static void multiplyOutput() {
        System.out.println(new SpeedrunOne().multiply(4,5));
    }

    private int multiply(int a, int b){
        return a*b;
    }

    private static void loop() {

        for(int i =0;i<10;i++){
            System.out.println(i+1);
        }

    }

    private static void conditions() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temperature  = readInteger(scanner);
        if(temperature<10){
            System.out.println("is cold");
        }else if(temperature<=25){
            System.out.println("is warm");
        }else {
            System.out.println("is  hot");
        }
    }
    private static int readingDivisor(Scanner scanner){
        System.out.println("Enter the number different than zero: ");
        while (true){
            try{
                String text = scanner.nextLine();
                int result = Integer.parseInt(text);
                if (result == 0) {
                    System.out.println("You can't divide by zero, please enter the number again: ");
                } else {
                    return result;
                }
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
    }

    private static int readInteger(Scanner scanner){
        System.out.println("Enter the number: ");
        while (true){
            try{
                String text = scanner.nextLine();
                return Integer.parseInt(text);
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
    }


    private static void variables() {

        int age = 25;
        double height = 1.75;
        boolean isStudent = true;
        char initial = 'A';
        String name = "Andrzej";

        List<Object> list = List.of(age,height,isStudent,initial,name);
        list.forEach(System.out::println);

    }

    private static void helloJava() {
        System.out.println("Hello, Java!");
    }

    private static void helloWorldProgram() {
        System.out.println("Hello, World!");

    }


}
