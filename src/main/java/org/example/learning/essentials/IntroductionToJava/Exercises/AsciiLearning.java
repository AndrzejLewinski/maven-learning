package org.example.learning.essentials.IntroductionToJava.Exercises;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class AsciiLearning {

    private static final Logger logger = LoggerFactory.getLogger(AsciiLearning.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        /// runHerbalLeaf()prints double empty line at the end of the program
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

    }



    private void exercise1() {
        int height = 4;
        for(int i =0;i<height;i++){
            for(int j=height-1;j>i;j--){
                //System.out.print("-");
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    private void exercise2() {
        int height = 4;
        for(int i =0;i<height;i++){
            //spacje
            for(int j = 0;j<i;j++){
                //System.out.print("_");
                System.out.print(" ");
            }
            for(int j=2*height-1;j>=2*i+1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }



}
