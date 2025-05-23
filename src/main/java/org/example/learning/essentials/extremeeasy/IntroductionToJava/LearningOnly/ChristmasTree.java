package org.example.learning.essentials.extremeeasy.IntroductionToJava.LearningOnly;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class ChristmasTree {

    private static final Logger logger = LoggerFactory.getLogger(ChristmasTree.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        /// runHerbalLeaf()prints double empty line at the end of the program
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.exercise3();

    }

    private void exercise3() {

        int loopLength = 5;
        char sign = '*';

        for(int i =0;i<loopLength;i++){ //  0,1,2,3,4 (loop runs 5 times)
            System.out.print("("+i+") "); // prints the current row index (useful for debugging)

            for(int j =0;j<=i;j++){ // for j<=i (j,i = 0),  prints (i + 1) "*" characters in each line
                System.out.print(sign);
            }

            System.out.println(); // moves to the next line after printing stars
        }
    }

    private void exercise2() {

        char sign = '*';

        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(sign);
            }
            System.out.println();
        }

    }

    private void exercise1() {
        char sign = '*';
        for(int i =0;i<5;i++)
            System.out.print(sign);

    }

    private void exercise0() {
        char sign = '*';
        for(int i =0;i<5;i++)
            System.out.println(sign);
    }
}
