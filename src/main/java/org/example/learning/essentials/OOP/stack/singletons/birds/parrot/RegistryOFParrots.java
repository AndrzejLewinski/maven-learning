package org.example.learning.essentials.OOP.stack.singletons.birds.parrot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.05.2025
 */
public class RegistryOFParrots {

    private static final RegistryOFParrots instance = new RegistryOFParrots();

    private final List<Parrot> parrotList = new ArrayList<>();


    public static RegistryOFParrots getInstance() {
        return instance;
    }

    public void registerParrot(Parrot parrot){
        parrotList.add(parrot);
    }


    public List<Parrot> returnParrotList() {
        return parrotList;
    }
}
