package org.example.learning.essentials.extremeeasy.IntroductionToJava.LearningOnly;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 23.05.2025
 */
public class ChristmasTree {

    private static final Logger logger = LoggerFactory.getLogger(ChristmasTree.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.christmasTree();

    }


    private void christmasTree() {
        int h = 4;
        for (int i = 1; i <= h; i++) {
            // Spacje
            for (int j = 1; j <= h - i; j++) {
                System.out.print("-");
            }
            // Gwiazdki
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Przejście do nowej linii
            System.out.println();
        }
    }


}
