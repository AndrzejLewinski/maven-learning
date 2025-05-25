package org.example.learning.essentials.OOP;

/**
 * Created by User on 25.05.2025
 */
public class InstanceAndStaticVariables {

    public static void main(String[] args) {

        Car car1 = new Car("red");
        Car car2 = new Car("blue");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());

    }

    private static class MathUtils{

        private static final double PI = Math.PI;

        public static void circleArea2(double radius){
            System.out.println(PI*radius*radius);
        }
        public static double circleArea(double radius){
            return (double) (PI*radius*radius);
        }
    }

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


    private static class Counter{

        private static int count = 0;  //zmienna statyczna zliczająca obiekty
        private int id;                // zmienna instancyjna przechowująca unikalny numer obiektu

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


