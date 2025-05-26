package org.example.learning.essentials.OOP.stack.singletons.elephant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class ElephantRegistry {

    private static final ElephantRegistry instance = new ElephantRegistry();

    @SuppressWarnings("FieldMayBeFinal")
    private List<Elephant> elephantList = new ArrayList<>();


    private ElephantRegistry() {

    }

    //musi być ta metoda statyczna, ponieważ wtedy wywołanie jej nie zadziała w innej klasie
    public static ElephantRegistry getInstance(){
        return instance;
    }

    public void register(Elephant elephant) {
        elephantList.add(elephant);
    }

    public List<Elephant> getElephants() {
        return elephantList;
    }
}
