package org.example.learning;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 19.05.2025
 */

public class QuickStart {

    private static final Logger logger = LoggerFactory.getLogger(QuickStart.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
         AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(1),new QuickStart().myAge(15),"\n");
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(2),new QuickStart().piNumber(),"\n");

    }

    private double piNumber(){
        return Math.PI;
    }

    @SuppressWarnings("unused")
    private int myAge(int age){
        return age;
    }

    @SuppressWarnings("unused")
    private static void helloWorld(){
        PrintUtils.printLine("Hello World!");
    }

    @SuppressWarnings("unused")
    private void exercises(){
        // PrintUtils.printObjectWithCustomSuffixes(new QuickStart().myAge(15)," (exercise_",1+")");
    }


}
