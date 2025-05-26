package org.example.learning.essentials.OOP.stack.singletons.giraffe;

/**
 * Created by User on 26.05.2025
 */
public class Giraffe {

    String name;
    int age;

    public Giraffe(String name, int age) {
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
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
