package org.example.learning.essentials.OOP.stack.observer;

/**
 * Created by User on 26.05.2025
 */

public class OutputObserver {

    public static void main(String[] args) {
        SimpleSubject subject = new SimpleSubject();

        Observer sms = new SMSObserver();
        Observer email = new EmailObserver();

        subject.addObserver(sms);
        subject.addObserver(email);

        // Symulacja zmiany statusu zamówienia
        subject.changeStatus("Wysłane");

    }

    private static void method1() {

        SimpleSubject subject = new SimpleSubject();

        Observer obs1 = new SimpleObserver("Observer 1");
        Observer obs2 = new SimpleObserver("Observer 2");
        Observer obs3 = new SimpleObserver("Observer 3");

        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);
    }
}
