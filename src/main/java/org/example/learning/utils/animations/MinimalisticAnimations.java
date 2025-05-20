package org.example.learning.utils.animations;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 20.05.2025
 */
public class MinimalisticAnimations {

    //shortest possible animation in my opinion
    @SuppressWarnings("unused")
    public static void loadingAndDotsAnimation() {
        final String[] frames = {"", ".", "..", "..."};
        final String input = "Loading";
        final int timeout = 220;
        final int repetitions = 2;
        final int dotsAfter = 1;
        for (int i = 0; i < repetitions; i++) {
            for (String frame : frames) {
                try {
                    System.out.print("\r" + input + frame);
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
        System.out.println();
    }
    //extreme minimalistic animation
    @SuppressWarnings("unused")
    public static void extremeMinimalisticGreenAnimation() {
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
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }
    //minimalistic animation
    @SuppressWarnings("unused")
    public static void minimalisticGreenLemonAnimation() {
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
            int currentDelay = (i < totalSteps / 2) ? delay : (delay / 2);
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / totalSteps) + "%");
            try {
                TimeUnit.MILLISECONDS.sleep(currentDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }
}
