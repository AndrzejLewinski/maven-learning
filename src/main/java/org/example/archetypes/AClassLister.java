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

        File folder = new File("E:\\Java\\ChatGPT\\ChatGPT_0\\maven-learning\\src\\main\\java\\org\\example\\archetypes");

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("The specified folder does not exist or is not a directory.");
            return;
        }
        // Get all .java files in the folder
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".java"));

        if (files == null || files.length == 0) {
            System.out.println("No .java files found in the folder.");
            return;
        }
        // Print class names (file names without .java extension)
        for (File file : files) {
            String fileName = file.getName();
            String className = fileName.substring(0, fileName.length() - 5); // Remove .java extension
            System.out.println(className);
        }

    }
}
