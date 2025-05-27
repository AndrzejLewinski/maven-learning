package org.example.learning.essentials.OOP.stack.singletons.singleton;

/**
 * Created by User on 27.05.2025
 */
public class SingletonCounter {

    private static final SingletonCounter instance = new SingletonCounter();

    private int counter;

    private SingletonCounter() {

    }

    public static SingletonCounter getInstance() {
        return instance;
    }

    public int get_value(){
        return counter;
    }

    public  void increment(){
        counter++;
    }


}
