package org.example.learning.essentials.OOP.stack.singletons.birds.toucan;

import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class ToucanOutput {


    public static void main(String[] args) {
        Toucan toucan1 = new Toucan("Tou",1);
        Toucan toucan2 = new Toucan("Tombi",2);

        RegistryOfToucans registry = RegistryOfToucans.getInstance();
        registry.register(toucan1);
        registry.register(toucan2);


        List<Toucan> registeredToucans = registry.getToucanList();
        registeredToucans.forEach(System.out::println);

    }

}
