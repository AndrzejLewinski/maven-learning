package org.example.learning.essentials.HelloWorld;

import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 10.06.2025
 */
public class HelloWorld {

    static Logger logger  = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");

        helloWorld("Hi there!");

        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }

    private static void helloWorld(String string) {
        System.out.println(string);
    }
}
