package org.example.learning.essentials.OOP.stack.singletons.bank;

import java.util.*;
/**
 * Created by User on 26.05.2025
 */
public class PersonV1 {

    private final Object lock = new Object();

    private String name;

    private int age;

    public String getName() {
        synchronized (lock){
            if(name.isEmpty()){
                throw new InputMismatchException("...");
            }else {
                return name;
            }
        }
    }

    public PersonV1(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        synchronized (lock){
            if(name.isEmpty()){
                throw new IllegalArgumentException("...");
            }else {
                this.name = name;
            }
        }

    }

    public int getAge() {
        synchronized (lock){
            if(age<0){
                throw new IllegalArgumentException("any message");
            }else {
                return age;
            }
        }

    }

    public void setAge(int age) {
        synchronized (lock){
            if(age<0){
                throw new IllegalArgumentException("...");
            }else {
                this.age = age;
            }
        }
    }

}

