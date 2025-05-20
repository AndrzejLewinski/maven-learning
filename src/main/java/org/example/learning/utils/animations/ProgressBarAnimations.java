package org.example.learning.utils.animations;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 20.05.2025
 */
public class ProgressBarAnimations {

    @SuppressWarnings("unused")
    public static void lemonSeedlingAndKiwi(){
        lemonSetup();
        seedlingSetup();
        kiwiSetup();
    }

    public static void lemonSetup(){
        int STEPS = 10;
        int DELAY = 225;
        minimalisticGreenLemon2(STEPS,DELAY);
    }

    public static void seedlingSetup(){
        int STEPS = 20;
        int DELAY = 150;
        minimalisticGreenLemon2(STEPS,DELAY);
    }

    public static void kiwiSetup(){
        int STEPS = 30;
        int DELAY = 150;
        minimalisticGreenLemon2(STEPS,DELAY);
    }

    private static void minimalisticGreenLemon2(int progressBarLength, int delay) {
        String[] symbols = {
                "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
                "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
        };
        String fullBar = "▓".repeat(progressBarLength);
        for (int i = 0; i <= progressBarLength; i++) {
            String currentProgress = fullBar.substring(0, i);
            String remaining = "▒".repeat(progressBarLength - i);
            String currentSymbol = symbols[i % symbols.length];
            int currentDelay = (i < progressBarLength / 2) ? delay : (delay / 2);
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / progressBarLength) + "%");
            try {
                TimeUnit.MILLISECONDS.sleep(currentDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }

}
