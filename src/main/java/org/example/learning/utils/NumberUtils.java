package org.example.learning.utils;

/**
 * Created by User on 19.05.2025
 */
@SuppressWarnings("unused")
public class NumberUtils {
    @SuppressWarnings("unused")
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    @SuppressWarnings("unused")
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}