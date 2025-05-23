package org.example.learning.utils;

/**
 * Created by User on 20.05.2025
 */
public class Config {

   //we really need this otherwise ith doesn't work
   public static final String workingDir = System.getProperty("user.dir");

   @SuppressWarnings("SpellCheckingInspection")
   public static final String LEARNING_PATH_FILE_PATH = workingDir + "/src/main/java/org/example/archetypes" +
            "/archetype/utils/learningpath/";
   public static final String ARCHETYPES_FILE_PATH = workingDir+"/src/main/java/org/example/archetypes/";

   @SuppressWarnings("SpellCheckingInspection")
   public static final String PACKAGE_PATH = "package org.example.archetypes.archetype.utils.learningpath;";




   @SuppressWarnings("unused")
   public static final String JAVA_EXTENSION = ".java";


}