package org.example.learning.essentials.OOP.stack.singletons.birds.penguins;


import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class PenguinsOutput {

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {

        //Instancjonujemy pingwiny
        PenguinV2 penguin = new PenguinV2("Pingo",3);
        PenguinV2 penguin1 = new PenguinV2("Ramzes",5);

        PenguinV2 penguin2 = PenguinFactory.createPenguin("Kizz", 4);


        PenguinsRegistry penguinsRegistry = PenguinsRegistry.getInstance();


        penguinsRegistry.register(penguin);
        penguinsRegistry.register(penguin1);
        penguinsRegistry.register(penguin2);


        List<PenguinV2> registeredPenguins = penguinsRegistry.getRegisteredPenguins();
        registeredPenguins.forEach(System.out::println);

    }
}
