package org.example.learning.utils;

/**
 * Created by User on 19.05.2025
 */
public class PrintUtils {

    // Simple method for printing a line of text
    public static void printLine(String text) {
        System.out.println(text);
    }

    // Prints text with a prefix
    public static void printWithPrefix(String prefix, String text) {
        System.out.println(prefix + text);
    }

    // Generic method that prints an element followed by a custom separator (e.g., " ", "|", "_")
    public static <T> void printWithSeparator(T element, String separator) {
        System.out.print(element + separator);
    }

    // Generic method that prints an element with a specified suffix (e.g., "_", " ", "|")
    public static <T> void printWithCustomSuffix(T element, String suffix) {
        System.out.print(element + suffix);
    }

    /// Generic method that prints an element followed by a space
    public static <T> void printWithSpace(T element) {
        System.out.print(element + " ");
    }

    public static void printEmptyLine(){
        System.out.println();
    }

    public static void printDoubleEmptyLine(){
        System.out.println();
        System.out.println();
    }

    // Example usage:
    // PrintUtils.printWithSeparator(12, "|");       -> prints "12|"
    // PrintUtils.printWithCustomSuffix("Hello", "_"); -> prints "Hello_"
    // PrintUtils.printWithSpace(100);               -> prints "100 "

}
