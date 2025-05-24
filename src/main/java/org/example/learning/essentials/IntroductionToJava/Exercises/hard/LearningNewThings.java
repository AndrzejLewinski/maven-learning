package org.example.learning.essentials.IntroductionToJava.Exercises.hard;

import org.example.learning.utils.animations.launcher.AnimationLauncher;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Created by User on 23.05.2025
 */
public class LearningNewThings {

    private static final Logger logger = Logger.getLogger(LearningNewThings.class.getName());

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runHerbalLeaf();
        @SuppressWarnings("unused")
        Scanner scanner = new Scanner(System.in);

    }

    @SuppressWarnings("unused")
    public static String readValidStringFromOptions2(Scanner scanner, String promptMessage, String... allowedValues) {
        //defensywna walidacja wejścia
        if (allowedValues == null || allowedValues.length == 0) {
            throw new IllegalArgumentException("Allowed values cannot be null or empty");
        }

        // Pre-normalize allowed values once for efficiency
        List<String> normalizedAllowed = Arrays.stream(allowedValues)
                .map(LearningNewThings::normalize)
                .collect(Collectors.toList());

        while (true) {
            System.out.print(promptMessage + " ");
            //do debugowania chcemy wiedzieć co użytkownik wpisał przed normalizacją
            String input = scanner.nextLine();

            String normalizedInput = normalize(input);

            /* index of zwraca - 1, jak czegoś nie ma na liście */
            int matchIndex = normalizedAllowed.indexOf(normalizedInput);
            //dlatego, jeżeli tutaj jest != -1 to oznacza, że coś do tej listy wpadło
            if (matchIndex != -1) {
                // Return the original allowed value (preserve original casing/spaces)
                return allowedValues[matchIndex];
            }

            System.out.println("Invalid input. Allowed values are: " + String.join(", ", allowedValues));
        }
    }

    /**
     * Normalize input: trim, remove all whitespace, convert to lower case.
     *
     * @param s input string
     * @return normalized string
     */
    private static String normalize(String s) {
        if (s == null) {
            return "";
        }
        return s.trim().replaceAll("\\s+", "").toLowerCase();
    }



    /**
     * Reads a valid string from the user input that must match one of the allowed options.
     * Ignores case and spaces in the comparison.
     *
     * @param scanner Scanner object to read input from.
     * @param message Message displayed to prompt the user.
     * @param allowedValues Varargs of allowed string options.
     * @return The matched option in lowercase.
     */
    @SuppressWarnings("unused")
    public static String readValidStringFromOptions(Scanner scanner, String message, String... allowedValues) {
        String input;
        while (true) {
            System.out.println(message);  // komunikat do użytkownika
            input = scanner.nextLine().trim();

            // Normalizujemy input (usuń spacje i ignoruj wielkość liter)
            String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

            for (String allowed : allowedValues) {
                String normalizedAllowed = allowed.replaceAll("\\s+", "").toLowerCase();
                if (normalizedInput.equals(normalizedAllowed)) {
                    return allowed.toLowerCase();  // lub allowed-jeśli chcesz oryginalną formę
                }
            }

            // Komunikat o błędzie z ładnym formatowaniem
            System.out.print("Invalid input. Allowed values are: ");
            StringBuilder optionsList = new StringBuilder();
            for (int i = 0; i < allowedValues.length; i++) {
                optionsList.append(allowedValues[i]);
                if (i < allowedValues.length - 1) {
                    optionsList.append(", ");
                }
            }
            System.out.println(optionsList);
        }
    }
}
