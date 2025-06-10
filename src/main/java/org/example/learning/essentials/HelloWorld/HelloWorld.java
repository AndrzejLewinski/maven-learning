package org.example.learning.essentials.HelloWorld;

import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by User on 10.06.2025
 */
public class HelloWorld {

    static Logger logger  = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");



        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }

    @SuppressWarnings("SameParameterValue")
    private void helloWorldTwo(String name) {
        System.out.println("Hello, "+name+"!");

    }


    private void learning(){
        Systemus.out.printSth("...");
    }
    @SuppressWarnings("SpellCheckingInspection")
    private static class Systemus{
        static Printus out = new Printus();
    }
    @SuppressWarnings("SpellCheckingInspection")
    private static class Printus{
        public void printSth(String string){
            System.out.println(string);
        }

    }

    @SuppressWarnings("unused")
    private static void noHelloWorld() {

        //Zapisujemy oryginalny System.out
        PrintStream originalOut = System.out;

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream tempOut = new PrintStream(buffer);
        System.setOut(tempOut);
        System.out.println("Hello World!");

        //Przywracamy oryginalny System.out
        System.setOut(originalOut);

        //Tego na dole już nie wypisało
        String output = buffer.toString().trim();
        System.out.println("Data from buffer:  "+output);

    }

    @SuppressWarnings("SameParameterValue")
    public static void helloWorldInput(String string) {
        System.out.println(string);
    }

    private static void helloWorld() {
        System.out.println("Hello, World!");
    }


}
