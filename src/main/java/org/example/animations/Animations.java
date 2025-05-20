package org.example.animations;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 15.05.2025
 */
public class Animations {
    public static void main(String[] args) {

        animation07();


    }


    @SuppressWarnings("unused")
    private static void animation01() {
        String[] symbols = {
                "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
                "🍏", "🍋", "🥒", "🥝", "🥑", "🌰", "🛤", "🥦", "🎄"
        };
        final int DEFAULT_STEPS = 10;
        final int DEFAULT_DELAY = 225;
        String fullBar = "▓".repeat(DEFAULT_STEPS);
        for (int i = 0; i <= DEFAULT_STEPS; i++) {
            String currentProgress = fullBar.substring(0, i);
            String remaining = "▒".repeat(DEFAULT_STEPS - i);
            String currentSymbol = symbols[i % symbols.length];
            int currentDelay = (i < DEFAULT_STEPS / 2) ? DEFAULT_DELAY : (DEFAULT_DELAY / 2);
            System.out.print("\rLoading: [" + currentProgress + currentSymbol + remaining + "] " + (i * 100 / DEFAULT_STEPS) + "%");
            try {
                TimeUnit.MILLISECONDS.sleep(currentDelay);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception");
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }
    @SuppressWarnings("unused")
    private static void animation02() {
        String[] loadingSymbols = {
                "🍃", "🌿", "🌱", "🌳", "🌾", "🍀", "🌵", "🌲", "🌻",
                "🍏", "🥒", "🥝", "🥑", "🌿", "🍃", "🌾", "🌱", "🌻", "🍀", "🌲",
                "🍃", "🍃", "🌵", "🥝", "🥦"
        };
        int steps = 40;
        String loadingBar = "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓";
        int delay = 100;
        System.out.print("Ładowanie ");
        for (int i = 0; i < steps; i++) {
            String symbol = loadingSymbols[i % loadingSymbols.length];
            String progress = loadingBar.substring(0, Math.min(i + 1, loadingBar.length()));
            String empty = " ".repeat(steps - (i + 1));
            int percentage = (int) (((double) i / (steps - 1)) * 100);
            System.out.print("\rŁadowanie " + symbol + " [" + progress + empty + "] " + percentage + "%");
            try {
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("\n⛔ Przerwano.");
                return;
            }
            if (i > 30) {
                delay = 50;
            }
        }
        System.out.println("\n✅ Ładowanie zakończone!");
    }
    @SuppressWarnings("unused")
    private static void animation03() {
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
    @SuppressWarnings("unused")
    private static void animation04() {
        String[] drops = {"🌿", "🍃", "🌱", "🍀"};
        int width = 15;
        int height = 1;
        for (int frame = 0; frame < 12; frame++) {
            System.out.print("\033[H\033[2J"); // Clear screen
            System.out.flush();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (Math.random() > 0.9) {
                        System.out.print(drops[(int) (Math.random() * drops.length)]);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            try {
                TimeUnit.MILLISECONDS.sleep(150);
            } catch (InterruptedException e) {
                System.err.println("⛔ Przerwano.");
                return;
            }
        }
        System.out.println("\n✅ Zielony deszcz zakończony!");
    }
    @SuppressWarnings("unused")
    private static void animation05() {
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
    // minimalistic solutions
    @SuppressWarnings("unused")
    private static void animation06() {
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
                System.out.println("InterruptedException ....");
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }
    @SuppressWarnings("unused")
    private static void animation07() {
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
    @SuppressWarnings("unused")
    private static void animation08() {
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
                System.out.println("wrong");
            }
        }
        System.out.println("\n✅ Załadowano! Wczytano wszystkie roślinki.");
    }
    @SuppressWarnings("unused")
    private static void animation09() {
        String RESET = "\033[0m";
        String CYAN = "\033[96m";
        String GREEN = "\033[32m";
        String LIGHT_GREEN = "\033[92m";
        String OLIVE_DRAB = "\033[38;5;60m";
        String LIME_GREEN = "\033[38;5;82m";
        String[] frames = {"|", "/", "-", "\\"};
        String input = "Ładowanie";
        int timeout = 150;
        int repetitions = 3;
        for (int i = 0; i < 1; i++) {
            for (String frame : frames) {
                System.out.print("\r" + input + " " + frame);
                try {
                    TimeUnit.MILLISECONDS.sleep(150);
                } catch (InterruptedException e) {
                    System.err.println("⛔ Animacja przerwana.");
                    return;
                }
            }
        }
        String fullBar = "▓▓▓▓▓▓▓▓▓▓";
        for (int i = 0; i < 10; i++) {
            String currentProgress = fullBar.substring(0, i + 1);
            String remaining = "▒".repeat(10 - (i + 1));
            System.out.print("\r" + input + " [" + LIME_GREEN + currentProgress + RESET + remaining + "] " + (i + 1) * 10 + "%");
            try {
                TimeUnit.MILLISECONDS.sleep(timeout);
            } catch (InterruptedException e) {
                System.err.println("⛔ Animacja przerwana.");
                return;
            }
        }
        System.out.println("\n✅ Gotowe!");
    }
}
