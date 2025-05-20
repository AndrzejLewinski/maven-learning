package org.example.learning.LightPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
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

        warmUpExercises.runConsoleProgramStepTwo();

    }

    @SuppressWarnings("unused")
    private void runConsoleProgramStepTwo(){
        Scanner scanner = new Scanner(System.in);
        String name = getNameFromUserForStepTwo(scanner);
        int age = getValidatedAge(scanner);
        boolean isAdult = isAdultForStepTwo(age);
        if(isAdult){
            System.out.println("Use is adult");
        }else {
            System.out.println("user is not adult");
        }
        Map<String,Integer> userMap = new LinkedHashMap<>();
        userMap.put(name,age);
        for(Map.Entry<String,Integer> eachMap : userMap.entrySet()){
            System.out.println(eachMap.getKey()+" "+eachMap.getValue());
        }
        System.out.println();
        userMap.forEach((key,value)-> System.out.println(key+" "+value));
    }

    private boolean isAdultForStepTwo(int number){
        return number>=18;
    }

    private String getNameFromUserForStepTwo(Scanner scanner){
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    private boolean isPositiveNumber(int number){
        return number>0;
    }

    private int getValidatedAge(Scanner scanner){
        System.out.println("Enter your age: ");
        int age;
        while (true){
            try{
                age =  scanner.nextInt();
                if(isPositiveNumber(age)){
                    return age;
                }else {
                    System.out.println("Age can't be negative number, enter a valid number: ");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter a valid numer: ");
                scanner.nextLine();
            }
        }
    }

    @SuppressWarnings("unused")
    private void runConsoleProgramStepOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = -1;
        boolean validationIfNumber = false;
        while (!validationIfNumber){
            try{
                age=scanner.nextInt();
                validationIfNumber = true;
            }catch (InputMismatchException e){
                System.out.println("Enter valid number: ");
                scanner.nextLine();
            }
        }
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
        scanner.close();
    }
    private boolean validateAgeForStepOne(int n){
        return n>=18;
    }

    private void logProgramStart() {
        logger.info("Program execution starts");
    }
}
