package org.example.archetypes.archetype.utils.classlister;

import org.example.learning.utils.Config;

import java.io.File;

import static org.example.archive.WarmUpExercises.logger;

/**
 * Created by User on 21.05.2025
 */
public class ClassLister {

    private static final String JAVA_EXTENSION = ".java";
    private static final String FOLDER_NOT_EXISTS = "The specified folder does not exist or is not a directory.";
    private static final String NO_JAVA_FILES = "No .java files found in the folder.";

    public static void main(String[] args) {
        ClassLister classLister = new ClassLister();
        classLister.listJavaClassNames();
    }

    private void listJavaClassNames() {
        String filePath = Config.ARCHETYPES_FILE_PATH;

        logger.info("🚀 Program started...");

        File folder = new File(filePath);

        if (!folder.exists() || !folder.isDirectory()) {
            logger.error(FOLDER_NOT_EXISTS);
            return;
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(JAVA_EXTENSION));
        if (files == null || files.length == 0) {
            logger.info(NO_JAVA_FILES);
            return;
        }

        logger.info("Found the following classes:");
        for (File file : files) {
            String fileName = file.getName();
            // Remove the extension from the file name and log it
            logger.info("Class found: {}", fileName.substring(0, fileName.length() - JAVA_EXTENSION.length()));
        }
    }
}
