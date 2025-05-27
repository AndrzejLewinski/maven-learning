package org.example.learning.essentials.OOP.stack.singletons.birds.penguinDI;

/**
 * Created by User on 27.05.2025
 */
public class PondFishProvider implements FishProvider{
    @Override
    public String getFish() {
        return "fish from the pond";
    }
}
