package org.example.learning.essentials.OOP.stack.singletons.birds.penguins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 26.05.2025
 */
@SuppressWarnings("unused")
public class PenguinV1 {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(PenguinV1.class);

    private final Object lock= new Object();

    //pole age jest private -> to jest fundament hermetyzacji
    private int age;

    public int getAge() {
        synchronized (lock) {
            if (age < 0) {
                throw new IllegalStateException("Age is invalid (negative)!");
            }
            return age;
        }
    }

    public void setAge(int age) {
        if(age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }synchronized (lock){
            this.age= age;
        }
    }

}
