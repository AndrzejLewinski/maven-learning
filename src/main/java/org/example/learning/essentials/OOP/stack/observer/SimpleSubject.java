package org.example.learning.essentials.OOP.stack.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class SimpleSubject implements Subject{

    private static final Logger logger = LoggerFactory.getLogger(SimpleSubject.class);

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o: observers){
            o.update(message);
        }
    }

    public void changeStatus(String newStatus) {
        logger.info("✅ Status zmieniony na: {}",newStatus);
        notifyObservers("Nowy status: " + newStatus);
    }



}
