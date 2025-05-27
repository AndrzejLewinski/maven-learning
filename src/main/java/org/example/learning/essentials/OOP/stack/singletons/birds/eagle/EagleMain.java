package org.example.learning.essentials.OOP.stack.singletons.birds.eagle;

import org.example.animations.ResultAnimations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by User on 27.05.2025
 */
public class EagleMain {

    private static final Logger logger = LoggerFactory.getLogger(EagleMain.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");

        Eagle eagle = new Eagle("Majestic",3);
        Eagle eagle1 = new Eagle("Apollo",4);

        EagleRegistry eagleRegistry = EagleRegistry.getInstance();
        eagleRegistry.register(eagle);
        eagleRegistry.register(eagle1);

        List<Eagle> list = eagleRegistry.getEagles();
        list.forEach(System.out::println);


        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }
}
