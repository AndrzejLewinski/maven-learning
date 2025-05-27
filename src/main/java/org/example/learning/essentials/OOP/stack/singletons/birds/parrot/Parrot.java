package org.example.learning.essentials.OOP.stack.singletons.birds.parrot;

/**
 * Created by User on 27.05.2025
 */
public class Parrot {

    String name;
    int age;

    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
