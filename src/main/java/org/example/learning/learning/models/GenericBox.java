package org.example.learning.learning.models;

/**
 * Created by User on 20.05.2025
 */
public class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box contains: " + value;
    }
}