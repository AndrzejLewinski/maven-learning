package org.example.learning.essentials.OOP.stack.singletons.birds.toucan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class RegistryOfToucans {

    private static final RegistryOfToucans instance = new RegistryOfToucans();

    private final List<Toucan> toucanList = new ArrayList<>();

    public static RegistryOfToucans getInstance(){
        return instance;
    }

    public List<Toucan> getToucanList() {
        return new ArrayList<>(toucanList);
    }

    public void register(Toucan toucan){
        toucanList.add(toucan);
    }
}
