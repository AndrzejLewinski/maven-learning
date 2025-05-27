package org.example.learning.essentials.OOP.stack.singletons.birds.penguins;

/**
 * Created by User on 26.05.2025
 */
public class PenguinV2 {

    final private String name;
    final private int age;

    public PenguinV2(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " lat)";
    }


    //static factory method
    public static PenguinV2 create(String name, int age) {
        return new PenguinV2(name, age);
    }


}
