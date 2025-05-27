package org.example.learning.essentials.OOP.stack.singletons.birds.penguinDI;

/**
 * Created by User on 27.05.2025
 */
public class Penguin {

    private final FishProvider fishProvider;

    // Dependency Injection przez konstruktor
    public Penguin(FishProvider fishProvider) {
        this.fishProvider = fishProvider;
    }

    public void eat() {
        String fish = fishProvider.getFish();
        System.out.println("Penguin eats " + fish);
    }
}
