package org.example.archetypes.archetype.utils.manager;

import org.example.learning.utils.Config;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.example.archive.WarmUpExercises.logger;

/**
 * Created by User on 20.05.2025
 */
public class ClassFileManager {

    public static void main(String[] args) {
        generateClasses();
    }


    private static void generateClasses() {
        ClassFileManager manager = new ClassFileManager();
        manager.generateClassFile("AAAExampleClass");
        manager.generateClassFile("AAAAExampleClass");
    }

    private void generateClassFile(String className) {
        String fileName = getFileName(className);
        String classContent = generateClassContent(className);
        writeClassToFile(classContent, fileName);
    }

    private String getFileName(String className) {
        String path = Config.ARCHETYPES_QUICK_PATH;
        return path + className + ".java";
    }

    private void writeClassToFile(String classContent, String fileName) {
        // Check if the directory exists, if not, try to create it
        File file = new File(fileName);
        File parentDir = file.getParentFile();

        if (parentDir != null && !parentDir.exists()) {
            boolean dirsCreated = parentDir.mkdirs();
            if (dirsCreated) {
                logger.info("Directory created: {}", parentDir.getAbsolutePath());
            } else {
                logger.error("Failed to create directory: {}", parentDir.getAbsolutePath());
                return;
            }
        }

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(classContent);
            logger.info("Class file {} generated successfully.", fileName);
        } catch (IOException e) {
            logger.error("⚠️ IOException while generating file: {}", fileName, e);
        }
    }

    private String generateClassContent(String className) {
        return "package org.example.archetypes;\n\n" +
                "/**\n" +
                " * Auto-generated class.\n" +
                " */\n" +
                "public class " + className + " {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello from " + className + "!\");\n" +
                "    }\n" +
                "}";
    }
}
