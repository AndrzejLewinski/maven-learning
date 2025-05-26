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
}
