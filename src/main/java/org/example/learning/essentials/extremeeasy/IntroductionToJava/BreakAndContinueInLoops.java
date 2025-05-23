package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import java.util.stream.IntStream;

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
        breakAndContinueInLoops.exercise5();

    }

    private void exercise5() {

        IntStream.rangeClosed(1,10).takeWhile(i->i<=7).forEach(PrintUtils::printIntegerWithSpace);
        System.out.println();
        IntStream.rangeClosed(1,20).filter(i->i%3!=0).forEach(PrintUtils::printIntegerWithSpace);

         System.out.println();
         IntStream.iterate(10, i -> i > 0, i -> i - 1)
                 .takeWhile(i -> i > 3)
                 .mapToObj(i -> i + " ")
                 .forEach(System.out::print);
         System.out.println();
         IntStream.rangeClosed(1,30).filter(i->i%5!=0).takeWhile(i->i<20).forEach(PrintUtils::printIntegerWithSpace);
         System.out.println();
         IntStream.rangeClosed(1,15).filter(i->i%2!=0)
                 .takeWhile(i->i<=12) // takes elements from the start as long as they are less than or equal to 12
                 .forEach(PrintUtils::printIntegerWithSpace);

    }


    @SuppressWarnings({"unused", "ContinueStatement", "BreakStatement"})
    private void exercise4() {

        IntStream.rangeClosed(1,31).filter(i->i%4!=0).takeWhile(i->i<21).forEach(PrintUtils::printIntegerWithSpace);

        System.out.println();

        for(int i =1;i<31;i++){
            if(i%4 == 0) {
                continue;
            }
            if(i>20){
                break;
            }
            System.out.print(i+" ");
        }
    }

    @SuppressWarnings("unused")
    private void exercise3() {
        IntStream.rangeClosed(1,20).filter(i->i%3!=0).takeWhile(i->i<16).forEach(PrintUtils::printIntegerWithSpace);
        System.out.println();
        System.out.println();
            for(int i = 1; i<21;i++){
                if(i % 3 ==0){
                    //noinspection ContinueStatement
                    continue;
                }
                if(i>15){
                    //noinspection BreakStatement
                    break;
                }
                System.out.print(i+" ");
            }
    }

    @SuppressWarnings({"BreakStatement", "unused"})
    private void exercise2() {

        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .takeWhile(i -> i != 8)
                .mapToObj(i -> i + " ")
                .forEach(System.out::print);

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                //noinspection ContinueStatement
                continue;
            }
            if (i == 8){
                break;
            }
            System.out.print(i+" ");
        }
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
















































