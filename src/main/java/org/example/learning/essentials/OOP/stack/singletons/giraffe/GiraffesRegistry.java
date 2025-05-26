package org.example.learning.essentials.OOP.stack.singletons.giraffe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2025
 */
public class GiraffesRegistry {

    private static final GiraffesRegistry instance = new GiraffesRegistry();

    @SuppressWarnings("FieldMayBeFinal")
    private List<Giraffe> giraffes = new ArrayList<>();


    public static GiraffesRegistry getInstance(){
        return instance;
    }

    public void addToList(Giraffe giraffe) {
        giraffes.add(giraffe);
    }

    public List<Giraffe> getRegisteredGiraffes() {
        return new ArrayList<>(giraffes);
    }

}
