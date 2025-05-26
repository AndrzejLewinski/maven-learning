package org.example.learning.essentials.OOP.stack.observer;

/**
 * Created by User on 26.05.2025
 */
public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);


}
