package org.example.archetypes;

import java.io.File;

import static org.example.archive.WarmUpExercises.logger;

/**
 * Created by User on 20.05.2025
 */
public class AClassLister {


    public static void main(String[] args) {
        AClassLister aClassLister = new AClassLister();
        aClassLister.printJavaClassNames();
    }

    private void printJavaClassNames(){
        logger.info(" 🚀 Program started!");
        logger.warn(" ⚠️ Something might be wrong...");
        logger.error("⛔ An error occurred.");


        System.out.println("🚀 Main logic starts here...");
        // reszta programu

        // Ścieżka do folderu z klasami, np. "bin/org/example/archetypes"
        File folder = new File("E:\\Java\\ChatGPT\\ChatGPT_0\\maven-learning\\src\\main\\java\\org\\example\\archetypes");

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("Folder nie istnieje lub nie jest katalogiem.");
            return;
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".java"));

        if (files == null || files.length == 0) {
            System.out.println("Brak plików .class w folderze.");
            return;
        }

        for (File file : files) {
            String fileName = file.getName();
            // Usuwamy rozszerzenie .java
            String className = fileName.substring(0, fileName.length() - 5);
            System.out.println(className);
        }
    }
}
