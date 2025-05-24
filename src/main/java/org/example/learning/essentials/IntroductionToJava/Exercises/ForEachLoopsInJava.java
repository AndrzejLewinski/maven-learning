package org.example.learning.essentials.IntroductionToJava.Exercises;

import org.example.animations.ResultAnimations;
import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 24.05.2025
 */
@SuppressWarnings("unused")
public class ForEachLoopsInJava {


    private static final Logger logger = LoggerFactory.getLogger(ForEachLoopsInJava.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///
        ForEachLoopsInJava forEachLoopsInJava = new ForEachLoopsInJava();
        forEachLoopsInJava.numbers();

        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");
    }

    private void numbers() {

        List<Integer> collect =
                IntStream.range(0, 10).map(i -> ThreadLocalRandom.current().nextInt(4)).boxed().collect(Collectors.toList());
        ResultAnimations.herbalLeaf("creating random list", "");
        collect.forEach(PrintUtils::printIntegerWithSpace);
        System.out.println();
        List<Integer> sorted = collect.stream().mapToInt(Integer::intValue).sorted().boxed().collect(Collectors.toList());
        sorted.forEach(PrintUtils::printIntegerWithSpace);
        System.out.println();

        int[] tab = new int[sorted.size()];
        for(int i =0;i<tab.length;i++){
            tab[i]=sorted.get(i);
            PrintUtils.printThreeVarAnimations("", tab[i]," ");
        }
        System.out.println();

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int number : tab) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int count =0;

        //we're finding maximum number
        for(Map.Entry<Integer,Integer> map : countMap.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
            if(map.getValue()>max){
                max = map.getValue();
            }
        }
        //we're getting keys
        List<Integer> keysWithMax = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == max) {
                keysWithMax.add(entry.getKey());
            }
        }
        System.out.println();
        System.out.println("max value ="+max);
        System.out.println("all keys for maximum values : ");
        keysWithMax.forEach(PrintUtils::printIntegerWithSpace);
        System.out.println();
    }

    private void output() {

        ///
        {
            List<Integer> collect = IntStream.range(0, 10).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
            collect.forEach(PrintUtils::printIntegerWithSpace);
            System.out.println();

            double doubleAverage = collect.stream().mapToInt(Integer::intValue).average().orElse(0);
            int average = (int)  doubleAverage;
            PrintUtils.printEmptyLine();
            int[] tab = new int[collect.size()];
            for(int i =0;i<collect.size();i++){
                tab[i]=collect.get(i);
                if(tab[i]>average){
                    int output = tab[i];
                    PrintUtils.printThreeVarAnimations("", output, " ");
                }
            }
            System.out.println();
            ResultAnimations.fourLeaf("(counting average value):","");
            String result = "average value is: ";
            PrintUtils.printThreeVarAnimations(result, " is ", average);
            System.out.println();
            boolean isPartialSuccess = false;
            @SuppressWarnings("ConstantValue")
            String message = isPartialSuccess ? "⚠️ logic partially passed" : "✅ Cleaning application";
            System.out.println();
            ResultAnimations.dotsAnimation(message, "");
        }
        ///

    }


    private void exercise9() {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);

        for(Integer integer : reversed){
            System.out.println(integer);
        }

    }

    private void exercise8() {

        int[] tab = {-3, 5, -1, 2, -7, 0};
        List<Integer> list = Arrays.asList(-3, 5, -1, 2, -7, 0);

        int count = 0;
        //noinspection ForLoopReplaceableByForEach
        for(int i =0;i<tab.length;i++){
            if(tab[i]>0){
                count++;
            }
        }
        System.out.println(count);
        long sum2 = list.stream().filter(i->i>0).count();
        System.out.println(sum2);

        int sum = list.stream()
                .filter(i -> i > 0)        // zostaw tylko dodatnie
                .mapToInt(Integer::intValue)          // zamień na IntStream
                .sum();

        System.out.println(sum);


    }

    private void exercise7() {
        int[] tab = {4, 9, 16, 25};
        List<Integer> list = Arrays.asList(4, 9, 16, 25);

        for(Integer integer : tab){
            double sqrt = Math.sqrt(integer);
            System.out.println(sqrt);
        }

        list.stream().mapToDouble(Math::sqrt).forEach(System.out::println);



    }

    private void exercise6() {

        int[] tab = {7, 0, 3, 9, 12};
        List<Integer> list = Arrays.asList(7, 0, 3, 9, 12);

        int sum = 0;
        for(Integer integer : tab){
            if(integer>5){
                sum+=integer;
            }
        }
        System.out.println(sum);
        int sum1 = list.stream().mapToInt(Integer::intValue).filter(i -> i > 5).sum();
        System.out.println(sum1);

    }

    private void exercise5() {

        int[] tab = {1, 5, 10};
        List<Integer> list = Arrays.asList(1, 5, 10);

        for(Integer integer : tab){
            System.out.println(3*integer);
        }
        System.out.println();
        list.stream().map(i->3*i).forEach(System.out::println);


    }

    private void exercise4() {
        List<Integer> list = new ArrayList<>();
        int[] tab = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for(Integer integer : tab){
            list.add(integer);
            if(integer%2==0){
                sum+=integer;
            }
        }
        System.out.println(sum);
        int sum1 = list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
    }

    @SuppressWarnings("SingleStatementInBlock")
    private void exercise3() {

        int[] tab = {2,4,6,8,10};

        int sum = 0;

        for(Integer integer : tab){
            sum+=integer;
            //System.out.println(sum);
        }
        System.out.println(sum);

    }

    private void exercise2() {

        String[] string = {"pies","kot","ryba"};

        for(String string1: string){
            System.out.println(string1.toUpperCase());
        }

    }

    private void exercise1() {

        int[] tab = {3,5,7,9};

        for(Integer integer : tab){
            System.out.println(integer);
        }
    }


}


































