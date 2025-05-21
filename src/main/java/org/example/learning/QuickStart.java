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
        /// AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        AnimationLauncher.runLemon();



    }


    @SuppressWarnings("unused")
    private static void helloWorld(){
        PrintUtils.printLine("Hello World!");
    }


}
