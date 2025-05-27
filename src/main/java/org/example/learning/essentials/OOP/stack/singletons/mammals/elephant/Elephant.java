package org.example.learning.essentials.OOP.stack.singletons.mammals.elephant;

/**
 * Created by User on 26.05.2025
 */
public class Elephant {

    String name;
    int age;

    public Elephant(String name, int age) {
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
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
