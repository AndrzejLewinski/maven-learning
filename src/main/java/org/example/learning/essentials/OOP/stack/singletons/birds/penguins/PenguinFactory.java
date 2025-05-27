package org.example.learning.essentials.OOP.stack.singletons.birds.penguins;

/**
 * Created by User on 27.05.2025
 */
public class PenguinFactory {

    // This is a factory method: it means we want to create a method that returns a Penguin object.

    //1. Single Responsibility Principle (Zasada pojedynczej odpowiedzialności)
    //
    //Klasa Penguin powinna odpowiadać tylko za reprezentowanie pingwina —
    // jego dane i zachowania (np. imię, wiek, metoda toString()).
    //Tworzenie instancji (szczególnie z dodatkową logiką) to inna odpowiedzialność — warto ją oddzielić.

    public static PenguinV2 createPenguin(String name, int age){
        //


        return new PenguinV2(name,age);
    }

}
