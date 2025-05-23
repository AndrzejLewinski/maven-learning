package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.essentials.hard.LearningNewThings;
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
         Scanner scanner = new Scanner(System.in);
         logger.info("🚀 Program starts...");
         AnimationLauncher.runHerbalLeaf();
         LogicalOperatorsInJava logicalOperatorsInJava = new LogicalOperatorsInJava();
         logicalOperatorsInJava.exercise6();
         scanner.close();
    }

    private void exercise6() {

        Scanner scanner = new Scanner(System.in);
        String role = LearningNewThings.readValidStringFromOptions(scanner, "chose your role: " +
                "user/admin/moderator/manager" +
                "/gameplayer","user","admin","moderator","manager","game player");
        System.out.println(role);


    }

    private void newMethodMiniTest() {
        String role = ValidationUtils
                .isValidStringFromThreeOptions(new Scanner(System.in), "admin", "user", "moderator");
        System.out.println("Your role is "+role);

    }

    private void checkUserAccess() {
        LogicalOperatorsInJava logicalOperatorsInJava = new LogicalOperatorsInJava();
        Scanner scanner = new Scanner(System.in);
        //We need to return String which is either admin, moderator or user, so we need a validation class for it
        //expected input from user : ADMIN  /  USER / MODERATOR
        System.out.println("What is your role ? Please answer : admin, moderator or user? ");
        String role = logicalOperatorsInJava.isValidRole(scanner);
        System.out.println("Your role is : "+role);

        boolean isAdmin = role.equals("admin");
        boolean isModerator = role.equals("moderator");
        boolean isUser = role.equals("user");

        System.out.println("Do you have active account ?");
        boolean hasActiveAccount     = ValidationUtils.readBoolean(scanner);
        System.out.println("Do you have subscription ?");
        boolean hasSubscription      = ValidationUtils.readBoolean(scanner);
        System.out.println("Do you accept the rules ?");
        boolean hasAcceptedTheRules  = ValidationUtils.readBoolean(scanner);

        boolean hasAccess = false;


        System.out.println("mini-test: "+isAdmin+isModerator+isUser);
    }

    //We need to return String which is either admin, moderator or user, so we need a validation class for it
    //expected input from user : ADMIN  /  USER / MODERATOR
    //We need to have a method which returns String value

    private String isValidRole(Scanner scanner){
        String input;
        while (true){
            System.out.println("Enter your role (admin/moderator/user): ");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("admin") || input.equalsIgnoreCase("user") || input.equalsIgnoreCase("moderator")){
                return input.toLowerCase();
            }else {
                System.out.println("Print proper role admin/user or moderator ? ");
            }
        }
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
