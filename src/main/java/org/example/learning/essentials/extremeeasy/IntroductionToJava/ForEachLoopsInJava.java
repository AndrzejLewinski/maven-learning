package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.animations.ResultAnimations;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 24.05.2025
 */
@SuppressWarnings("unused")
public class ForEachLoopsInJava {


    private static final Logger logger = LoggerFactory.getLogger(ForEachLoopsInJava.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runHerbalLeaf();

            ForEachLoopsInJava forEachLoopsInJava = new ForEachLoopsInJava();
            forEachLoopsInJava.exercise10();
    }

    private void exercise10() {
        ResultAnimations.fourLeaf("(counting boolean value)",true);

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


































