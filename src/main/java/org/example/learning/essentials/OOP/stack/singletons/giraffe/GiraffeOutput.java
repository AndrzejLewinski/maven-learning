package org.example.learning.essentials.OOP.stack.singletons.giraffe;

import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class GiraffeOutput {

    public static void main(String[] args) {
        Giraffe giraffe1 = new Giraffe("Giro",10);
        Giraffe giraffe2 = new Giraffe("Jinni",10);


        GiraffesRegistry registry = GiraffesRegistry.getInstance();
        registry.addToList(giraffe1);
        registry.addToList(giraffe2);


        List<Giraffe> registeredGiraffes = registry.getRegisteredGiraffes();
        registeredGiraffes.forEach(System.out::println);


    }
}
