package org.example.learning.essentials.OOP.stack.singletons.penguins;

/**
 * Created by User on 26.05.2025
 */
public class Penguin {

    final private String name;
    final private int age;

    public Penguin(String name, int age){
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


}
