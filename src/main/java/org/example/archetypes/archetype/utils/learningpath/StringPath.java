package org.example.archetypes.archetype.utils.learningpath;

import java.io.File;

/**
 * Created by User on 21.05.2025
 */
public class StringPath {
    public static void main(String[] args) {
        
        // Ścieżka względna do folderu
        String relativePath = "src/main/java/org/example/archetypes/";

        // Tworzymy obiekt File dla folderu
        File folder = new File(relativePath);

        // Pobieramy absolutną ścieżkę
        String absolutePath = folder.getAbsolutePath();

        // Wypisujemy pełną ścieżkę
        System.out.println(absolutePath);
    }
}
