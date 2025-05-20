package org.example.archetypes.archetype.utils;

import org.example.learning.utils.Config;

import java.io.FileWriter;
import java.io.IOException;

import static org.example.archive.WarmUpExercises.logger;

/**
 * Created by User on 20.05.2025
 */
public class ClassFileManager {

    public static void main(String[] args) {
       classGenerator();
    }
    private static void classGenerator(){


        ClassFileManager aClassLister = new ClassFileManager();

        //przetestowane, że działa
        aClassLister.classPreGenerator("AAAExampleClass");
        aClassLister.classPreGenerator("AAAAExampleClass");

    }

    @SuppressWarnings("unused")
    private void classPreGenerator(String className){
        String fileName = fileName(className);
        String classContent = classContent(className);
        writingClass(classContent,fileName);
    }
    private String fileName(String className){
        String path = Config.ARCHETYPES_QUICK_PATH;
        return path + className + ".java";
    }
    @SuppressWarnings("CallToPrintStackTrace")
    private void writingClass(String classContent, String fileName){
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(classContent);
            System.out.println("Class file " + fileName + " generated successfully.");
        } catch (IOException e) {
            logger.error("⚠️ IOException while generating file: {}", fileName);
            e.printStackTrace();
        }
    }
    private String classContent(String className) {
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
