package org.example.learning.utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 19.05.2025
 */
@SuppressWarnings("unused")
public class PrintUtils {

    // Simple method for printing a line of text
    @SuppressWarnings("unused")
    public static void printLine(String text) {
        System.out.print(text);
    }

    public static void printStringWithSpace(String text) {
        System.out.print(text+" ");
    }
    public static void printIntegerWithSpace(int number) {
        System.out.print(number+" ");
    }
    public static void printIntegerAndReplace(int number){
        System.out.print("\r"+number+" ");
    }

    @SuppressWarnings("unused")
    public static void printlnStringLine(String text) {
        System.out.println(text);
    }


    @SuppressWarnings("unused")
    public static<T> void printAnimation(T input){
        String sth = input.toString();
        char[] charArray = sth.toCharArray();
        for(Character c : charArray){
            try {
                System.out.print(c);
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unused")
    public static void printObject(Object object){
        System.out.print(object);
    }

    public static void printObjectWithSpace(Object object){
        System.out.print(object+" ");
    }

    public static <T> void printThreeVariables(T var1, T var2, T var3){
        System.out.print(String.valueOf(var1)+ var2+var3);
    }

    public static <T> void printThreeVarAnimations(T prefix, T output, T suffix){
        final int DELAY = 125;
        String sth = prefix.toString();
        char[] charArray = sth.toCharArray();
        for(Character c : charArray){
            try {
                System.out.print(c);
                TimeUnit.MILLISECONDS.sleep(DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String sth2 = output.toString();
        char[] charArray2 = sth2.toCharArray();
        for(Character c : charArray2){
            try {
                System.out.print(c);
                TimeUnit.MILLISECONDS.sleep(DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String sth3 = suffix.toString();
        char[] charArray3 = sth3.toCharArray();
        for(Character c : charArray3){
            try {
                System.out.print(c);
                TimeUnit.MILLISECONDS.sleep(DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getSuffix(int number) {
        return " (exercise_" + number + ")";
    }

    public String getPrefix(int number) {
        return "(exercise_" + number + ")  |  ";
    }

    @SuppressWarnings("unused")
    public static void printlnObject(Object object){
        System.out.println(object);
    }

    // Prints text with a prefix
    @SuppressWarnings("unused")
    public static void printWithPrefix(String prefix, String text) {
        System.out.println(prefix + text);
    }

    // Generic method that prints an element followed by a custom separator (e.g., " ", "|", "_")
    @SuppressWarnings("unused")
    public static <T> void printWithSeparator(T element, String separator) {
        System.out.print(element + separator);
    }

    // Generic method that prints an element with a specified suffix (e.g., "_", " ", "|")
    @SuppressWarnings("unused")
    public static <T> void printWithCustomSuffix(T element, String suffix) {
        System.out.print(element + suffix);
    }

    /// Generic method that prints an element followed by a space
    @SuppressWarnings("unused")
    public static <T> void printWithSpace(T element) {
        System.out.print(element + " ");
    }
    @SuppressWarnings("unused")
    public static void printEmptyLine(){
        System.out.println();
    }
    @SuppressWarnings("unused")
    public static void printDoubleEmptyLine(){
        System.out.println();
        System.out.println();
    }

    // Example usage:
    // PrintUtils.printWithSeparator(12, "|");       -> prints "12|"
    // PrintUtils.printWithCustomSuffix("Hello", "_"); -> prints "Hello_"
    // PrintUtils.printWithSpace(100);               -> prints "100 "

}
