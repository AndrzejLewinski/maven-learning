package org.example.learning.essentials.OOP.records;

import org.example.animations.ResultAnimations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 25.05.2025
 */
public class ObjectOrientedBasics {
    private static final Logger logger = LoggerFactory.getLogger(ObjectOrientedBasics.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ResultAnimations.dotsAnimation("(", "");

        ObjectOrientedBasics objectOrientedBasics = new ObjectOrientedBasics();
        objectOrientedBasics.method2();

        ResultAnimations.dotsAnimation("", ")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");
    }

    private void method2() {

    }
}
