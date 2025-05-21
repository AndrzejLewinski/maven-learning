package org.example.learning.essentials.extremeeasy;

import org.example.learning.QuickStart;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 21.05.2025
 */
public class LoopsInJava {

    private static final Logger logger = LoggerFactory.getLogger(QuickStart.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        new ControlFlowBasics().forLoop();

    }


}
