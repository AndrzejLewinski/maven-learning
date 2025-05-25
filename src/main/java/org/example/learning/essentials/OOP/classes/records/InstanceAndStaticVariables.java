package org.example.learning.essentials.OOP.classes.records;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 25.05.2025
 */
public class InstanceAndStaticVariables {

    public static void main(String[] args) {
        Student student = new Student("Ada","SLO1");
        Student student2 = new Student("Ania","SLO1");

        for(Map.Entry<String,String> map : Student.getTotalStudents().entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

    }

    private static class Student{

        private final String name;
        private final String schoolName;

        private static int totalStudents = 0;

        public static final Map<String,String> students = new HashMap<>();


        private Student(String name, String schoolName) {
            this.name = name;
            this.schoolName = schoolName;
            totalStudents++;
            students.put(name,schoolName);
        }

        public String getSchoolName() {
            return schoolName;
        }

        public String getName() {
            return name;
        }

        public static Map<String,String> getTotalStudents() {
            return new HashMap<>(students);
        }
    }

    private static class Vehicle{

        private final String type; //instancyjne
        private final int id; //instancyjne

        private static int nextId =1;
        private static int totalVehicles =0;

        private static Map<String,Integer> typeCount = new HashMap<>();

        public Vehicle(String type) {
            this.type = type;
            this.id = nextId++; //id instancyjne id nadawane automatycznie //int nextId -> do generowania unikalnego id

            totalVehicles++;
            typeCount.put(type,typeCount.getOrDefault(type,0)+1);
        }

        public String getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        static void printStatistics(){
            System.out.println("Total vehicles: "+totalVehicles);
            for(Map.Entry<String,Integer> entry : typeCount.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }

    @SuppressWarnings("unused")
    private static class MathUtils{

        private static final double PI = Math.PI;

        public static void circleArea2(double radius){
            System.out.println(PI*radius*radius);
        }
        public static double circleArea(double radius){
            return PI*radius*radius;
        }
    }


    @SuppressWarnings("unused")
    private static class Car{

        private final String color;
        private static int numberOfCars;

        public Car(String color) {
            this.color = color;
            numberOfCars++;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }


    @SuppressWarnings("unused")
    private static class Person{

        String name;
        String species = "Homo sapiens";

        public Person(String name){
            this.name = name;
        }

        private void output(){
            System.out.println("name "+name+" "+species);
        }

    }


    @SuppressWarnings("unused")
    private static class Counter{

        private static int count = 0;  //zmienna statyczna zliczająca obiekty
        private final int id;                // zmienna instancyjna przechowująca unikalny numer obiektu

        public Counter() {
            count++; //zwiększamy licznik obiektów
            id=count; //przypisujemy bieżącą wartość licznika do obiektu
        }

        public int getId(){
            return id;
        }

        public static int getCount(){
            return count;
        }

        public void output(){
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            Counter c4 = new Counter();

            System.out.println(c1.getId());
            System.out.println(c2.getId());
            System.out.println(c3.getId());
            System.out.println(c4.getId());

            System.out.println(Counter.getCount());
        }



    }

}


