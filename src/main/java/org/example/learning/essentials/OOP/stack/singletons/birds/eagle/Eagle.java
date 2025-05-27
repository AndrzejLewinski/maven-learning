package org.example.learning.essentials.OOP.stack.singletons.birds.eagle;

/**
 * Created by User on 27.05.2025
 */
public class Eagle {

    String name;
    int age;

    public Eagle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
