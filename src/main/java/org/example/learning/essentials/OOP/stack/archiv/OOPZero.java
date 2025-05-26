package org.example.learning.essentials.OOP.stack.archiv;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 25.05.2025
 */



class OOPZero {


    private interface Animal {

        @SuppressWarnings("unused")
        void makeSound();
        @SuppressWarnings("unused")
        void sleep();

    }


    public static void main(String[] args) {
        Owl owl = new Owl("Kazia");
        Owl owl2 = new Owl("Basia");
        System.out.println(owl.getName());
        OOPZero animalsZero = new OOPZero();
        animalsZero.addAnimal(owl);
        animalsZero.addAnimal(owl2);
        animalsZero.printData();
        animalsZero.makeAllSounds();
    }

    private final List<Animal> animals = new ArrayList<>();

    @SuppressWarnings("ClassEscapesDefinedScope")
    public void addAnimal(Animal animal){
        animals.add(animal);
        System.out.println(animal.getClass().getSimpleName()+" added to list");
    }
    public void printData(){
       for(Animal eachAnimal : animals){
           System.out.println(eachAnimal.toString());
       }
    }
    public void makeAllSounds(){
        for(Animal eachAnimal: animals){
            eachAnimal.makeSound();
        }
    }

    @SuppressWarnings("unused")
    public void clearAnimals(){
        animals.clear();
    }


    @SuppressWarnings("unused")
    private static class Cat implements Animal{

        String name;

        @Override
        public void makeSound() {
            System.out.println("Cat which has name "+name+": makes a sound meow");
        }

        @Override
        public void sleep() {
            System.out.println(name+" is sleeping ...");
        }

        @SuppressWarnings("unused")
        public Cat(String name) {
            this.name = name;
        }

        @SuppressWarnings("unused")
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Owl implements Animal{

        private final String name;

        public Owl(String name) {
            this.name = name;
        }

        @Override
        public void makeSound() {
            System.out.println("Owl named "+name+" hoots 'Hooo Hoooo' ");
        }

        @Override
        public void sleep() {
            System.out.println(name+"is sleeping ...");
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Owl{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


}
