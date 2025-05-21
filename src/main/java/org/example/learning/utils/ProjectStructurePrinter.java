package org.example.learning.utils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ProjectStructurePrinter {

    public static void main(String[] args) {
        // Startowy katalog - np. src/main/java
        String startDir = System.getProperty("user.dir") + "/src/main/java/org/example/learning/utils/animations";

        System.out.println("🔍 Szukanie plików w katalogu: " + startDir);
        Path startPath = Paths.get(startDir);

        try {
            Files.walkFileTree(startPath, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    System.out.println("📁 " + dir.toString());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    System.out.println("  📄 " + file.toString());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.err.println("❌ Błąd podczas przeszukiwania plików: " + e.getMessage());
        }
    }
}
