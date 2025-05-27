package org.example.learning.essentials.OOP.stack.singletons.mammals.elephant;

import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class ElephantOutput {

    public static void main(String[] args) {
        Elephant elephant1 = new Elephant("Elio",4);
        Elephant elephant2 = new Elephant("Elan",6);


        ElephantRegistry elephantsRegistry = ElephantRegistry.getInstance();
        elephantsRegistry.register(elephant1);
        elephantsRegistry.register(elephant2);

        List<Elephant> elephantList = elephantsRegistry.getElephants();
        elephantList.forEach(System.out::println);


    }
}
