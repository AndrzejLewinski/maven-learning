package org.example.learning;
import org.example.animations.ResultAnimations;
import org.example.learning.essentials.IntroductionToJava.ScopeOfVariables.ScopeOfVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 19.05.2025
 */

public class QuickStart {

    private static final Logger logger = LoggerFactory.getLogger(QuickStart.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");

        ScopeOfVariables scopeOfVariables = new ScopeOfVariables();


        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");
    }

}
