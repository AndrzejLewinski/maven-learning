package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.animations.ResultAnimations;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 24.05.2025
 */
public class ScopeOfVariables {

    private static final Logger logger = LoggerFactory.getLogger(ScopeOfVariables.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///
        /// ResultAnimations.herbalLeaf("comment: ", "");

        ScopeOfVariables scopeOfVariables = new ScopeOfVariables();
        scopeOfVariables.exampleOne();

        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");



    }

    private void exampleOne() {




        ResultAnimations.lemon("","✔");
    }
}
