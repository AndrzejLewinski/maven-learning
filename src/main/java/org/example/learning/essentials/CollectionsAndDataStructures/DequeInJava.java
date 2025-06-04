package org.example.learning.essentials.CollectionsAndDataStructures;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by User on 27.05.2025
 */

public class DequeInJava {

    public static void main(String[] args) {

        //double ended queue

        Deque<String> deque = new LinkedList<>();

        // Dodajemy elementy na koniec (tak jak w kolejce)
        deque.addLast("Anna");
        deque.addLast("Bartek");

        // Dodajemy element na początek (jak w stosie)
        deque.addFirst("Cezary");

        System.out.println("Zawartość deque:");
        deque.forEach(System.out::println);

    }

}
