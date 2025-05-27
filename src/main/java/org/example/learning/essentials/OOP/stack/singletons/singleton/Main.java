package org.example.learning.essentials.OOP.stack.singletons.singleton;

import org.example.learning.essentials.OOP.stack.singletons.birds.penguinDI.*;

/**
 * Created by User on 27.05.2025
 */
public class Main {

    public static void main(String[] args) {


        FishProvider pond = new PondFishProvider();
        FishProvider zoo = new ZookeeperFishProvider();

        Penguin penguin1 = new Penguin(pond);
        Penguin penguin2 = new Penguin(zoo);

        penguin1.eat(); // Penguin eats fish from the pond
        penguin2.eat(); // Penguin eats fish from the zookeeper


    }


}
