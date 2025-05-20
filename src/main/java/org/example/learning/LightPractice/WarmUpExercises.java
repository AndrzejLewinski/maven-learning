package org.example.learning.LightPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by User on 19.05.2025
 */
public class WarmUpExercises {

    public static final Logger logger = LoggerFactory.getLogger(WarmUpExercises.class);

    public static void main(String[] args) {
        WarmUpExercises warmUpExercises = new WarmUpExercises();
        warmUpExercises.logProgramStart();
        warmUpExercises.runConsoleProgramStepOne();

    }

    private void runConsoleProgramStepOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        boolean isAdult = validateAgeForStepOne(age);
        if(isAdult){
            System.out.println("Jesteś pełnoletni");
        }else {
            System.out.println("Jeseś niepełnoletni");
        }
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put(name,age);
        for(Map.Entry<String,Integer> eachMap : map.entrySet()){
            System.out.println(eachMap.getKey()+" "+eachMap.getValue());
        }
    }

    private boolean validateAgeForStepOne(int n){
        return n>=18;
    }

    private void logProgramStart() {
        logger.info("Program execution starts");
    }
}
