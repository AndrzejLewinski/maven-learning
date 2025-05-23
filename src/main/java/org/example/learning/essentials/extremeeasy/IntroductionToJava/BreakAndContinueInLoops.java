package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

/**
 * Created by User on 23.05.2025
 */
public class BreakAndContinueInLoops {


    private static final Logger logger = LoggerFactory.logger(BreakAndContinueInLoops.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        BreakAndContinueInLoops breakAndContinueInLoops = new BreakAndContinueInLoops();
        breakAndContinueInLoops.exercise2();

    }

    private void exercise2() {





    }

    @SuppressWarnings("unused")
    private void exercise1() {

        int result = 0;
        for(int i =0;i<10;i++){
         System.out.print(i+" ");
         if(i==5){
             result = i;
             //noinspection BreakStatement
             break;
         }
        }
        System.out.println();
        System.out.println("Number : "+result);
        for (int i = 0; i < 10; i++) {
         if (i % 2 == 0) {
             //noinspection ContinueStatement
             continue; // pomija liczby parzyste
         }
         System.out.print(i+" "); // wypisze tylko nieparzyste
         }
    }

}
















































