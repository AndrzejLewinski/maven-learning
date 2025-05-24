package org.example.learning.essentials.IntroductionToJava.Exercises.hard;

import org.example.animations.ResultAnimations;
import org.example.learning.utils.PrintUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 24.05.2025
 */
public class ForEachTasks {

    public static void main(String[] args) {

        ForEachTasks forEachTasks = new ForEachTasks();
        forEachTasks.numbers();
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

}
