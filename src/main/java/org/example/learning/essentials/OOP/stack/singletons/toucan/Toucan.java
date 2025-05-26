package org.example.learning.essentials.OOP.stack.singletons.toucan;

/**
 * Created by User on 26.05.2025
 */
public class Toucan {

    String name;
    int age;

    public Toucan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Toucan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
