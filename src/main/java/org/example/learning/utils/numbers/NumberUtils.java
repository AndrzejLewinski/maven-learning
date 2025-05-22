package org.example.learning.utils.numbers;

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

    private int reverseIntegerNumber(int number) {

        //Creating string from number
        String string = String.valueOf(number);

        //Convert number to character array
        char[] digits = string.toCharArray();

        // Reverse characters
        char[] reversed  = new char[digits.length];
        for(int i =0;i<digits.length;i++){
            reversed[i]=digits[digits.length-i-1];
        }

        //Convert back to number
        int reversedNumber = 0;
        for(int i =0;i<reversed.length;i++){
            reversedNumber = (int) (reversedNumber+ (reversed.length-i)*Math.pow(10,reversed.length-i-1));
        }
        return reversedNumber;
    }
}