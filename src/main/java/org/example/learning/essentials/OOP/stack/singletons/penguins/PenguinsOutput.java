package org.example.learning.essentials.OOP.stack.singletons.penguins;


import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class PenguinsOutput {

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {

        //Instancjonujemy pingwiny
        Penguin penguin = new Penguin("Pingo",3);
        Penguin penguin1 = new Penguin("Ramzes",5);


        PenguinsRegistry penguinsRegistry = PenguinsRegistry.getInstance();


        penguinsRegistry.register(penguin);
        penguinsRegistry.register(penguin1);


        List<Penguin> registeredPenguins = penguinsRegistry.getRegisteredPenguins();
        registeredPenguins.forEach(System.out::println);

    }
}
