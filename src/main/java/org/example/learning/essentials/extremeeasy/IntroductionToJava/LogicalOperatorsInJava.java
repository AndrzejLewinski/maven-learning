package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.example.learning.utils.validation.ValidationUtils;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class LogicalOperatorsInJava {

    private static final Logger logger = LoggerFactory.logger(LogicalOperatorsInJava.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        AnimationLauncher.runHerbalLeaf();
        LogicalOperatorsInJava logicalOperatorsInJava = new LogicalOperatorsInJava();
        logicalOperatorsInJava.exercise3();
    }

    private void exercise3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many steps have you made today ? ");
        int stepsToday = ValidationUtils.readInteger(scanner);
        int goal = 10000;
        System.out.println("Do we have a bonus day ? ");
        boolean bonusDay = ValidationUtils.readBoolean(scanner);
        if(bonusDay || stepsToday>goal){
            System.out.println("User will receive a gift.");
        }
        scanner.close();
    }

    private void exercise2() {
        Scanner scanner = new Scanner(System.in);
        int x = ValidationUtils.readInteger(scanner);
        int y = ValidationUtils.readInteger(scanner);

        if(x<y){
            System.out.println(" x < y");
        }else if(x==y){
            System.out.println("x = y");
        }else{
            System.out.println("x>y");
        }

    }

    private void exercise1() {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        if(!isRaining){
            System.out.println("It's raining!");
        }else {
            System.out.println("It's not raining!");
        }
    }

    private void exercise() {
        Scanner scanner = new Scanner(System.in);
        int number = ValidationUtils.readInteger(scanner);
        isGreaterThanThree(number);
    }

    private void isGreaterThanThree(int number){
        if (number>3){
            System.out.println(number+" is greater than three.");
        }else {
            System.out.println(number+" is not greater than three.");
        }
    }

























}
