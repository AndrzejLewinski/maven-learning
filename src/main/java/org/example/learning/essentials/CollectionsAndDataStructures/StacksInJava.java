package org.example.learning.essentials.CollectionsAndDataStructures;
import java.util.Stack;

/**
 * Created by User on 27.05.2025
 */
public class StacksInJava {

    public static void main(String[] args) {


    }

    private static void basics0() {


        Stack<String> stack = new Stack<>();

        // Dodajemy elementy na stos
        stack.push("Anna");
        stack.push("Bartek");
        stack.push("Cezary");

        // Wypisujemy stos
        System.out.println("Stos: " + stack);

        // Zdejmujemy (usuwamy) element ze stosu - ten ostatnio dodany
        String removed = stack.pop();
        System.out.println("Zdjęto ze stosu: " + removed);

        // Pokazujemy stos po zdjęciu elementu
        System.out.println("Stos po zdjęciu: " + stack);

        // Sprawdzamy, co jest na górze stosu, ale bez zdejmowania
        String top = stack.peek();
        System.out.println("Na górze stosu jest: " + top);

        System.out.println("Dodajemy troll'a : ");
        stack.push("Troll");
        System.out.println(stack);
        System.out.println("Dodajemy super trolla: ");
        stack.push("Super Troll");
        System.out.println(stack);
        System.out.println(stack.peek()+ " jest na górze ");

    }


}
