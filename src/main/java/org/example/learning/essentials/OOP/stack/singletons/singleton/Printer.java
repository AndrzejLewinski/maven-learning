package org.example.learning.essentials.OOP.stack.singletons.singleton;

/**
 * Created by User on 27.05.2025
 */
public class Printer {

    private static Printer instance;

    private Printer() {
    }

    public static synchronized Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void printMessage(String message){
        System.out.println(message);
    }


}
