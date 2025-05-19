package org.example.learning.HelpClasses;

/**
 * Created by User on 19.05.2025
 */
public class TestableCircle {

    final private int radius;

    public TestableCircle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}
