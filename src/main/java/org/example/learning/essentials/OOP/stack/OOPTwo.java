package org.example.learning.essentials.OOP.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 25.05.2025
 */
@SuppressWarnings("unused")
public class OOPTwo {


    public static void main(String[] args) {
        OOPTwo elephantOne  = new OOPTwo("eli",200,1000);
        OOPTwo elephantTwo  = new OOPTwo("ele",200,1000);

        List<OOPTwo> elephantOnes = new ArrayList<>();
        elephantOnes.add(elephantOne);
        elephantOnes.add(elephantTwo);
        for(OOPTwo elephantOne1 : elephantOnes){
            elephantOne1.sleep();
            elephantOne1.speak();
            //noinspection UseOfSystemOutOrSystemErr
            System.out.println(elephantOne1);
        }
    }

    String name;
    int height;
    int weight;

    void sleep(){
        System.out.println(name + " is sleeping ...");
    }
    void speak(){
        System.out.println(name +" is making a sound tooooooot ");
    }

    public OOPTwo(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ElephantOne{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
