package org.example.archetypes;

import org.example.learning.utils.Config;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.example.archive.WarmUpExercises.logger;

/**
 * Created by User on 20.05.2025
 */
public class AClassLister {


    public static void main(String[] args) {
       classGenerator();
    }
    private static void classGenerator(){


        AClassLister aClassLister = new AClassLister();

        //przetestowane, że działa
        aClassLister.classPreGenerator("AAAExampleClass");
        aClassLister.classPreGenerator("AAAAExampleClass");

    }

    @SuppressWarnings("unused")
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
            System.err.println("⚠️ IOException while generating file: " + fileName);
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
