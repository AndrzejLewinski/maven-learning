package org.example.learning.essentials.OOP.classes.records;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 25.05.2025
 */
public class ClassesAndObjectsInJava {

    public static void main(String[] args) {

        CarRent carRent = new CarRent();
        carRent.addCar(new Car("Ford", "Mustang"));
        carRent.addCar(new Car("Fiat", "Multipla"));
        carRent.listOfCars();

    }

    private static class CarRent{

        @SuppressWarnings("FieldMayBeFinal")
        private List<Car> cars = new ArrayList<>();

        public CarRent() {
        }

        void addCar(Car car){
            cars.add(car);
        }

        void listOfCars(){
            for(Car car : cars){
                System.out.println(car);
            }
        }
    }

    private static class Car{
        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }

        String brand;
        String model;

        public Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        @SuppressWarnings("unused")
        void drive(){
            System.out.println("Driving "+getBrand()+" "+getModel());
        }

        private String getModel() {
            return model;
        }

    }



}
