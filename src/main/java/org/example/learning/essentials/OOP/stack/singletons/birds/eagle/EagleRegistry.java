package org.example.learning.essentials.OOP.stack.singletons.birds.eagle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.05.2025
 */
public class EagleRegistry {

    private static final EagleRegistry instance = new EagleRegistry();

    private final List<Eagle> eagleList = new ArrayList<>();

    public static EagleRegistry getInstance() {
        return instance;
    }

    public List<Eagle> getEagles(){
        return new ArrayList<>(eagleList);
    }

    @SuppressWarnings("unused")
    public void register(Eagle eagle){
        eagleList.add(eagle);
    }


}
