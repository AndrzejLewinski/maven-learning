package org.example.archetypes.archetype.utils;

import org.example.learning.utils.Config;

import java.io.File;

import static org.example.archive.WarmUpExercises.logger;

/**
 * Created by User on 21.05.2025
 */
public class ClassLister {

    public static void main(String[] args) {
        ClassLister classLister =  new ClassLister();
        classLister.printJavaClassNames();
    }


    private void printJavaClassNames(){

        String filePath = Config.ARCHETYPES_FILE_PATH;

        logger.info(" 🚀 Program started!");
        logger.warn(" ⚠️ Something might be wrong...");
        logger.error("⛔ An error occurred.");
        System.out.println("🚀 Main logic starts here...");
        String folderNotExists= "The specified folder does not exist or is not a directory.";
        String noJavaFiles="No .java files found in the folder.";
        String javaExtension = ".java";
        File folder = new File(filePath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println(folderNotExists);
            return;
        }
        File[] files = folder.listFiles((dir, name) -> name.endsWith(javaExtension));
        if (files == null || files.length == 0) {
            System.out.println(noJavaFiles);
            return;
        }
        for (File file : files) {
            String fileName = file.getName();
            System.out.println(file.getName().substring(0, fileName.length()-5));
        }
    }
}
