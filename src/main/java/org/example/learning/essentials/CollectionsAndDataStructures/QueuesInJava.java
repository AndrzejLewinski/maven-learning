package org.example.learning.essentials.CollectionsAndDataStructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by User on 27.05.2025
 */
public class QueuesInJava {

    public static void main(String[] args) {


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
