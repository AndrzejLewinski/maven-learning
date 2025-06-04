package org.example.learning.essentials.Speedruns.SpeedrunTwo;

import org.example.animations.ResultAnimations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 27.05.2025
 */
@SuppressWarnings("unused")
public class SpeedrunTwo {

    private static final Logger logger = LoggerFactory.getLogger(SpeedrunTwo.class);

    public static void main(String[] args) {
        programStarts();

        loopsInJava();

        programEnds();
    }

    private static void loopsInJava() {
        LoopsInJava instance = LoopsInJava.getInstance();
        instance.loops();
    }

    private static void variablesAndDataTypes() {
        VariablesAndDataTypes instance = VariablesAndDataTypes.getInstance();
        instance.printVariables();
    }

    private static void introductionToJava() {
        IntroductionToJava introductionToJava = IntroductionToJava.getInstance();
        introductionToJava.print();
        introductionToJava.helloWorld();
    }

    private static void programEnds() {
        ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");
    }

    private static void programStarts() {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ResultAnimations.dotsAnimation("(","");
    }






}
