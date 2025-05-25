package org.example.learning.essentials.OOP;

/**
 * Created by User on 25.05.2025
 */
public class ConstructorsInJava {

    public static void main(String[] args) {

        Car car = new Car("Ford Mustang",2005);
        System.out.println(car.fuel);
        car.drive();
        car.engineOn = true;
        for(int i =0;i<12;i++){
            car.drive();
            System.out.println(car.fuel);
        }
        System.out.println(car.fuel);
        System.out.println(car.engineOn);
    }

    private static class Car{
        String model;
        int year;
        boolean engineOn;
        int fuel = 100;

        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        void drive(){
            if (!engineOn) {
                System.out.println("Cannot drive. The engine is off.");
                return;
            }
            if (fuel <= 0) {
                stopEngine();
                System.out.println("Out of fuel! Engine stopped.");
                return;
            }
            // Jeśli tu jesteśmy — silnik jest włączony i paliwo > 0
            System.out.println("Driving " + model + " from year " + year);
            fuel -= 10;
            if (fuel <= 0) {
                stopEngine();
                System.out.println("Out of fuel! Engine stopped.");
            }
        }

        void startEngine(){
            if(fuel > 0){
                engineOn = true;
                System.out.println("Engine started.");
            }if(fuel==0){
                System.out.println("Cannot start engine. Fuel tank is empty");
            }

        }

        void refuel(int amount){
            if (amount <= 0) {
                System.out.println("Invalid refuel amount.");
                return;
            }
            fuel += amount;
            if (fuel > 100) {
                fuel = 100;
            }
            System.out.println("Refueled to " + fuel + "%");
        }

        void stopEngine(){
            engineOn = false;
            System.out.println("Engine stopped.");
        }

    }

}
