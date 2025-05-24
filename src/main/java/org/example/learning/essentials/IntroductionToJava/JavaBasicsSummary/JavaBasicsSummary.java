package org.example.learning.essentials.IntroductionToJava.JavaBasicsSummary;

import org.example.animations.ResultAnimations;
import org.example.learning.essentials.IntroductionToJava.ScopeOfVariables.ScopeOfVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 24.05.2025
 */
public class JavaBasicsSummary {


    private static final Logger logger = LoggerFactory.getLogger(JavaBasicsSummary.class);


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
