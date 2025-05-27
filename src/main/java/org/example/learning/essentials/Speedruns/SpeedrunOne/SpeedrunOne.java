package org.example.learning.essentials.Speedruns.SpeedrunOne;
import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by User on 27.05.2025
 */

public class SpeedrunOne {

    private static final Logger logger = LoggerFactory.getLogger(SpeedrunOne.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");


        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }

    private static double divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("You can't divide by zero");
        }return (double) a/b;
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

    @SuppressWarnings("unused")
    private static class extremeEasyOne {
        private static void names3() {
            List<String> names = new ArrayList<>(Arrays.asList("Jan", "Katarzyna", "Olek"));
            // Sortowanie według długości (rosnąco)
            //Najtrudniejsze z tych wszystkich zadań, nie pamiętałem tego sorted (Comparator.comparingInt())
            List<String> sortedByLength = names.stream()
                    .sorted(Comparator.comparingInt(String::length))
                    .collect(Collectors.toList());
            System.out.println("Imiona posortowane wg długości:");
            for (String name : sortedByLength) {
                System.out.println(name);
            }
            System.out.println(sortedByLength.get(sortedByLength.size()-1));
        }
        private static void names2() {
            List<String> names = Arrays.asList("Anna", "Tomek", "Ola");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if(i<names.size()-1){
                    stringBuilder.append(name).append(",");
                }else {
                    stringBuilder.append(name);
                }
            }
            System.out.println(stringBuilder);
        }
        private static void numbers() {
            List<Integer> numbers = Arrays.asList(4, 12, 9, 15, 3, 20);
            int counter = 0;
            for(Integer number: numbers){
                if(number>10){
                    counter++;
                }
            }
            System.out.println(counter);
        }
        @SuppressWarnings("BreakStatement")
        private static void names4() {
            List<String> words = Arrays.asList("banan", "ananas", "arbuz", "cytryna");
            String name = "";
            String string = words.stream().filter(i -> i.toLowerCase().startsWith("a")).findFirst().orElse("");
            System.out.println(string);

            for(String word: words){
                if(word.toLowerCase().charAt(0)=='a'){
                    name = word;
                    break;
                }
            }
            System.out.println(name);
        }
        private static void numbers1() {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
            List<Integer> collect = numbers.stream().map(i -> i + 1).collect(Collectors.toList());
            collect.forEach(System.out::println);
        }
        private static void letters() {

            List<String> names = Arrays.asList("ala", "bartek", "celina");
            List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
            collect.forEach(System.out::println);
        }
        private static void filteringExercise() {

            List<Integer> numbers = Arrays.asList(2, 5, 6, 9, 12);
            List<Integer> collect = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
            collect.forEach(System.out::println);
        }
        private static void sorting() {

            List<Integer> numbers = Arrays.asList(5, 1, 8, 3);
            Stream<Integer> sorted = numbers.stream().sorted();
            sorted.forEach(System.out::println);
        }
        private static void names() {

            List<String> names = Arrays.asList("Adam", "Ewa", "Ola", "Marek");
            List<String> collect = names.stream().sorted().collect(Collectors.toList());
            collect.forEach(System.out::println);
        }
    }

    @SuppressWarnings("unused")
    private static class Backups{

        ///  Backup Classes
        @SuppressWarnings("unused")
        private static class BackupZero{
            /// Backup Zero

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
            private static void division() {
                Scanner scanner = new Scanner(System.in);
                int x = readInteger(scanner);
                int y = readingDivisor(scanner);
                double result = divide(x,y);
                System.out.println(result);
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
    }
}
