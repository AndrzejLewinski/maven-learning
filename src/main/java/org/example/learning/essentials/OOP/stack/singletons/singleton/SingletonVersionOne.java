package org.example.learning.essentials.OOP.stack.singletons.singleton;
;

/**
 * Created by User on 27.05.2025
 */
public class SingletonVersionOne {

    private static final SingletonVersionOne instance = new SingletonVersionOne();

    private String name;

    private SingletonVersionOne(){
        this.name="Default";
    }

    public static SingletonVersionOne getInstance(){
        return instance;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{name='" + name + "'}";
    }


}
