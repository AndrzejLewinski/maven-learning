package org.example.learning.essentials.CollectionsAndDataStructures;

import org.example.learning.QuickStart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by User on 27.05.2025
 */
public class QueuesInJava {

    private static final Logger logger = LoggerFactory.getLogger(QueuesInJava.class);

    public static void main(String[] args) {


    }

    private static void basics5() {
        Queue<String> queue = new LinkedList<>();

        queue.add("Anna");
        queue.add("Bartek");
        queue.add("Cezary");
        queue.add("Kasia");
        queue.add("Łukasz");
        queue.add("Marta");

        // Wypisujemy, kto jest w kolejce
        System.out.println("Kto jest w kolejce?");
        queue.forEach(i-> System.out.print(i+" "));
        System.out.println();

        // Obsługujemy klientów - usuwamy z kolejki i wypisujemy ich
        System.out.println("\nObsługa klientów:");
        while (!queue.isEmpty()) {

            String served = queue.poll(); // usuwa i zwraca pierwszą osobę
            System.out.println("Obsługuję: " + served);
        }

        System.out.println("Kolejka jest pusta.");

    }

    private static void basics4() {
        Queue<String> queue = new LinkedList<>();

        // Dodajemy osoby do kolejki
        queue.add("Anna");
        queue.add("Bartek");
        queue.add("Cezary");

        logger.info(queue.toString());

        // Obsługujemy pierwszą osobę (usuwa ją z kolejki)
        String served = queue.poll();
        logger.info("queue.poll() {}",served);
        System.out.println("Obsłużona osoba: " + served);

        // Dodajemy nową osobę do kolejki
        queue.add("Kasia");
        logger.info("queue.add -> Kasia");

        // Pokazujemy kto jest teraz w kolejce
        System.out.println("Aktualna kolejka:");
        queue.forEach(System.out::println);

        logger.info(queue.toString());

    }

    private static void basics3() {

        Queue<String> queue = new LinkedList<>();

        queue.add("Anna");
        queue.add("Bartek");
        System.out.println(queue);
        logger.info(queue.toString());

        // Nowa osoba dołącza do kolejki
        queue.add("Cezary");
        logger.info("Cezary added to Queue");

        System.out.println(queue);
        logger.info(queue.toString());

    }

    private static void basics2() {
        Queue<String> queue = new LinkedList<>();

        // Dodajemy klientów do kolejki
        queue.add("Jan");
        queue.add("Marta");
        queue.add("Piotr");
        queue.add("Kasia");
        queue.add("Łukasz");

        // Obsługujemy pierwszych 3 klientów
        for (int i = 0; i < 3; i++) {
            String served = queue.poll();
            System.out.println("Obsłużony klient: " + served);
        }

        // Wypisujemy klientów, którzy zostali w kolejce
        System.out.println("Klienci w kolejce:");
        queue.forEach(System.out::println);

    }

    private static void extremeEasy() {

        Queue<String> queue = new LinkedList<>();
        queue.add("Anna");
        queue.add("Bartek");
        queue.add("Cezary");

        queue.forEach(System.out::println);

        List<String> list = new ArrayList<>(queue);
        for (int i = 0, listSize = list.size(); i < listSize; i++) {
            String string = list.get(i);
            System.out.println(i+" "+string);

        }

    }

    private static void basics() {
        //Kolejka to struktura danych first in first out

        //tworzymy prostą kolejkę
        Queue<String> queue = new LinkedList<>();

        //dodajemy elementy do kolejki
        queue.add("Ala");
        queue.add("Ola");
        queue.add("Ela");

        System.out.println(queue);
        String first = queue.poll();
        System.out.println(first);
        System.out.println(queue);



    }

}
