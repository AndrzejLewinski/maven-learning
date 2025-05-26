package org.example.learning.essentials.OOP.stack.observer;

/**
 * Created by User on 26.05.2025
 */
public class SimpleObserver implements Observer {
    private String name;

    public SimpleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " otrzymał powiadomienie: " + message);
    }
}
