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
        logicalOperatorsInJava.exercise5();
    }

    private void exercise5() {
        System.out.println("Please give us your age : ");
        Scanner scanner= new Scanner(System.in);
        int age = ValidationUtils.readInteger(scanner);
        System.out.println("Do you have an invitation to this party: ");
        boolean invitationCondition = ValidationUtils.readBoolean(scanner);
        System.out.println("Are you on VIP List ? ");
        boolean isVIP = ValidationUtils.readBoolean(scanner);
        System.out.println("Are you drunk ?  ");
        boolean isDrunk = ValidationUtils.readBoolean(scanner);
        System.out.println("What's the time currently right now ? ");
        int time = ValidationUtils.readIntInRange(scanner,0,23);
        boolean afterMidnight = time >= 0 && time < 6;
        boolean isAdult = isAdult(age);
        boolean invitationOrVIP = invitationCondition || isVIP;
        boolean isSober = !isDrunk;
        boolean allPositiveConditions = isAdult && invitationCondition && isSober;
        boolean normalConditions = isAdult && isSober && invitationOrVIP;
        boolean isUserPermittedToEnter = allPositiveConditions || !afterMidnight && normalConditions;
        if(isUserPermittedToEnter){
            System.out.println("Use is eligible to enter");
        }else {
            System.out.println("User is not eligible to enter.");
        }
    }

    private boolean isAdult(int number){
        return number>=18;
    }

    private void exercise4() {
        int age = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you have a ticket? Please answer 'true' or 'false': ");
        boolean hasTicket = ValidationUtils.readBoolean(scanner);

        System.out.println("Is it after 10PM? Please answer 'true' or 'false': ");
        boolean isAfter10PM = ValidationUtils.readBoolean(scanner);

        if (isAdult(age) && hasTicket && isAfter10PM) {
            System.out.println("✅ User is eligible for the late-night movie screening.");
        } else {
            System.out.println("⛔ User is not permitted to attend the late-night screening.");
        }
    }

    private void exercise3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many steps have you taken today ? ");
        int stepsToday = ValidationUtils.readInteger(scanner);
        int goal = 10000;
        System.out.println("Is today a bonus day y ? ");
        boolean bonusDay = ValidationUtils.readBoolean(scanner);

        if (bonusDay || stepsToday > goal) {
            System.out.println("🎁 Congratulations! You are eligible for a reward.");
        } else {
            System.out.println("Keep going! You're doing great — no reward today, but you're getting closer!");
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
        boolean isRaining = ValidationUtils.readBoolean(scanner);
        if (isRaining) {
            System.out.println("It's raining!");
        } else {
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
