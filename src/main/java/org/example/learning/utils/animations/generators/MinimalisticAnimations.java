package org.example.learning.utils.animations.generators;

import org.example.learning.utils.PrintUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 20.05.2025
 */
public class MinimalisticAnimations{

    public static String[] SYMBOLS = {
            "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
            "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
    };

    public static void main(String[] args) {
       MinimalisticAnimations minimalisticAnimations = new MinimalisticAnimations();
       minimalisticAnimations.fourLeafClover();
    }

    @SuppressWarnings("unused")
    public void herbalLeafAnimation(){printProgressBar(1,225,SYMBOLS);}

    @SuppressWarnings("unused")
    public void fourLeafClover(){printProgressBar(5,250, SYMBOLS);}

    private static void printProgressBar(int totalSteps, int delay, String[] symbols) {
        String fullBar = "▓".repeat(totalSteps);

        for (int i = 0; i <= totalSteps; i++) {
            String currentProgress = fullBar.substring(0, i);
            String remaining = "▒".repeat(totalSteps - i);
            String currentSymbol = symbols[i % symbols.length];
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / totalSteps) + "%");
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

    //shortest possible animation in my opinion
    @SuppressWarnings({"unused"})
    public static void loadingAndDotsAnimation() {
        final String[] frames = {"", ".", "..", "..."};
        final int timeout = 220;
        String input = "Loading";
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

}
