package org.example.learning.essentials.OOP.stack.singletons.birds.penguins;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2025
 */

public class PenguinsRegistry {


    private static final PenguinsRegistry instance = new PenguinsRegistry();


    @SuppressWarnings("FieldMayBeFinal")
    private List<PenguinV2> registeredPenguins = new ArrayList<>();

    private PenguinsRegistry(){

    }

    public static PenguinsRegistry getInstance(){
        return instance;
    }

    public void register(PenguinV2 penguin){
        registeredPenguins.add(penguin);
    }

    public List<PenguinV2> getRegisteredPenguins() {
        return new ArrayList<>(registeredPenguins);
    }

}
