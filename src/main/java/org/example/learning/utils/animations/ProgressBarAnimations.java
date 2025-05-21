package org.example.learning.utils.animations;

import org.example.learning.QuickStart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 20.05.2025
 */
public class ProgressBarAnimations {

    private static final Logger logger = LoggerFactory.getLogger(ProgressBarAnimations.class);

    public static final String[] GREEN_SYMBOLS = {
            "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
            "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
    };

    public static void main(String[] args) {
        lemonSeedlingAndKiwi();
    }

    @SuppressWarnings("unused")
    public static void lemonSeedlingAndKiwi(){
        ProgressBarAnimations progressBarAnimations = new ProgressBarAnimations();
        progressBarAnimations.lemonAnimation();
        progressBarAnimations.seedlingAnimation();
        progressBarAnimations.kiwiAnimation();

    }

    public void lemonAnimation(){
        int STEPS = 10;
        int DELAY = 225;
        minimalisticGreenLemon2(STEPS,DELAY);
    }

    public void seedlingAnimation(){
        int STEPS = 20;
        int DELAY = 150;
        minimalisticGreenLemon2(STEPS,DELAY);
    }

    public void kiwiAnimation(){
        int STEPS = 30;
        int DELAY = 150;
        minimalisticGreenLemon2(STEPS,DELAY);
    }

    private static void minimalisticGreenLemon2(int progressBarLength, int delay) {
        String[] symbols = GREEN_SYMBOLS;
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
                logger.error("Interrupted Exception");
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }

}
