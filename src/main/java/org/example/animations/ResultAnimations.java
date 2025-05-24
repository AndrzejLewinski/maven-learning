package org.example.animations;

import org.example.learning.utils.PrintUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 24.05.2025
 */
public class ResultAnimations {


    public static <T> void dotsAnimation(String description, T result) {
        final String[] frames = {"", ".", "..", "..."};
        final int timeout = 220;
        final int repetitions = 2;
        final int dotsAfter = 1;
        for (int i = 0; i < repetitions; i++) {
            for (String frame : frames) {
                try {
                    System.out.print("\r" + description + frame);
                    TimeUnit.MILLISECONDS.sleep(timeout);
                } catch (InterruptedException e) {
                    System.err.println("Animation interrupted");
                    return;
                }
            }
        }
        for (int i = 0; i < dotsAfter; i++) {
            try {
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(timeout);
            } catch (InterruptedException e) {
                System.err.println("Animation interrupted");
                return;
            }
        }
        System.out.print(" "+result);
        System.out.println();
    }


    public static <T> void fourLeaf(String description, T output) {

        String[] symbols = {
                "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
                "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
        };

        int totalSteps = 5;
        int delay = 250;
        String fullBar = "▓".repeat(totalSteps);

        for (int i = 0; i <= totalSteps; i++) {
            String currentProgress = fullBar.substring(0, i);
            String remaining = "▒".repeat(totalSteps - i);
            String currentSymbol = symbols[i % symbols.length];
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / totalSteps) + "%");
            System.out.print(" "+description+" ");
            System.out.print(output);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("❌ Przerwano animację");
            }
        }
        PrintUtils.printEmptyLine();
    }


    @SuppressWarnings("unused")
    public static <T> void lemon(String description, T output) {

        String[] symbols = {
                "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
                "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
        };

        int totalSteps = 10;
        int delay = 225;
        String fullBar = "▓".repeat(totalSteps);

        for (int i = 0; i <= totalSteps; i++) {
            String currentProgress = fullBar.substring(0, i);
            String remaining = "▒".repeat(totalSteps - i);
            String currentSymbol = symbols[i % symbols.length];
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / totalSteps) + "%");
            System.out.print(" "+description+" ");
            System.out.print(output);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("❌ Przerwano animację");
            }
        }
        System.out.println();
    }

    @SuppressWarnings("unused")
    public static <T> void herbalLeaf(String description, T output) {

        String[] symbols = {
                "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
                "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
        };

        int totalSteps = 1;
        int delay = 225;
        String fullBar = "▓".repeat(totalSteps);

        for (int i = 0; i <= totalSteps; i++) {
            String currentProgress = fullBar.substring(0, i);
            String remaining = "▒".repeat(totalSteps - i);
            String currentSymbol = symbols[i % symbols.length];
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / totalSteps) + "%");
            System.out.print(" "+description+" ");
            System.out.print(output);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("❌ Przerwano animację");
            }
        }
        System.out.println();
    }

}
