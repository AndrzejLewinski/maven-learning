package org.example.animations;

import org.example.learning.utils.PrintUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 24.05.2025
 */
public class ResultAnimations {


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
        PrintUtils.printDoubleEmptyLine();
        //System.out.println("\n✅ Załadowano!");
    }


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
        PrintUtils.printDoubleEmptyLine();
        //System.out.println("\n✅ Załadowano!");
    }

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
        PrintUtils.printDoubleEmptyLine();
        //System.out.println("\n✅ Załadowano!");
    }


}
