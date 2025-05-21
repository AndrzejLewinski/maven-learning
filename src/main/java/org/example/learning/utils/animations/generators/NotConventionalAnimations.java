package org.example.learning.utils.animations.generators;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 20.05.2025
 */

public class NotConventionalAnimations {


    //warning it is not conventional animation
    @SuppressWarnings("unused")
    public void leafRainAnimation() {
        String RESET = "\033[0m";
        String[] shades = {
                "\033[38;5;34m", "\033[38;5;40m", "\033[38;5;46m", "\033[38;5;82m"
        };
        String[] drops = {"🌿", "🍃", "🌱", "🍀"};
        int width = 12;
        for (int frame = 0; frame < 14; frame++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < width; i++) {
                if (Math.random() > 0.9) {
                    int colorIdx = (frame + i) % shades.length;
                    String emoji = drops[(int) (Math.random() * drops.length)];
                    line.append(shades[colorIdx]).append(emoji);
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line + RESET);
            try {
                TimeUnit.MILLISECONDS.sleep(150);
            } catch (InterruptedException e) {
                System.err.println("⛔ Przerwano.");
            }
        }
        System.out.println();
    }

    //warning - it is not conventional animation
    @SuppressWarnings("unused")
    public void gradientProgressBarAnimation() {
        String[] greenShades = {
                "\033[38;5;22m", "\033[38;5;28m", "\033[38;5;34m",
                "\033[38;5;40m", "\033[38;5;46m", "\033[38;5;82m",
                "\033[38;5;118m", "\033[38;5;154m", "\033[38;5;190m", "\033[38;5;154m"
        };
        String RESET = "\033[0m";
        int totalSteps = greenShades.length;
        for (int i = 0; i <= totalSteps; i++) {
            StringBuilder bar = new StringBuilder();
            for (int j = 0; j < i; j++) {
                bar.append(greenShades[j]).append("▓");
            }
            bar.append("▒".repeat(Math.max(0, totalSteps - i)));
            int percent = i * 100 / totalSteps;
            System.out.print("\rGradient loading: [" + bar + RESET + "] " + percent + "%");
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                System.err.println("⛔ Przerwano.");
                return;
            }
        }
        System.out.println("\n✅ Zielony gradient zakończony.");
    }
}
