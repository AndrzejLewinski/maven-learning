package org.example.learning.essentials.extremeeasy;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 21.05.2025
 */
public class LoopsInJava {

    private static final Logger logger = LoggerFactory.getLogger(LoopsInJava.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        for(int i =0;i<10;i++){
            try {
                PrintUtils.printIntegerWithSpace(i);
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        PrintUtils.printEmptyLine();
        for(int i =0;i<10;i++){
            try {
                PrintUtils.printIntegerAndReplace(i);
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        PrintUtils.printEmptyLine();
        int number = 1;
        while (number<=10){
            PrintUtils.printIntegerWithSpace(number);
            number++;
        }
        PrintUtils.printEmptyLine();
        int counter = 1;
        do{
            PrintUtils.printIntegerWithSpace(counter);
            counter++;
        }while (counter<=3);

        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> list = new ArrayList<>();
        for (int i1 = 0; i1 < fruits.length; i1++) {
            String eachElement = fruits[i1];
            list.add(i1, eachElement);
        }

        PrintUtils.printDoubleEmptyLine();
        list.forEach(PrintUtils::printObjectWithSpace);
        PrintUtils.printEmptyLine();
        for(String eachElement: fruits){
            PrintUtils.printStringWithSpace(eachElement);
        }
        PrintUtils.printDoubleEmptyLine();
        int sum = 0;
        for(int i =1;i<=100;i++){
            sum+=i;
        }
        PrintUtils.printThreeVariables("sum = ",sum,"\n");
        int sum1 = IntStream.rangeClosed(1, 100).sum();
        PrintUtils.printThreeVariables("sum from 1 to 100 = ",sum1,"\n");
        PrintUtils.printEmptyLine();
        counter =1;
        while (counter<=20){
            if(counter%2==0){
                PrintUtils.printIntegerWithSpace(counter);
            }
            counter++;
        }
        PrintUtils.printEmptyLine();
        int[] numbers = {3, 7, 12, 15, 20};
        for(Integer eachNumber : numbers){
            if(eachNumber>10){
                PrintUtils.printIntegerWithSpace(eachNumber);
            }
        }
        PrintUtils.printEmptyLine();
        List<Integer> collect = IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printIntegerWithSpace);
        PrintUtils.printEmptyLine();
    }


}
