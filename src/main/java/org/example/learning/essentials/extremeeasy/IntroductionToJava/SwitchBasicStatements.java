package org.example.learning.essentials.extremeeasy.IntroductionToJava;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by User on 22.05.2025
 */
public class SwitchBasicStatements {

    private static final Logger logger = LoggerFactory.getLogger(SwitchBasicStatements.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        SwitchBasicStatements switchBasicStatements = new SwitchBasicStatements();
        switchBasicStatements.JavaCoffee();
    }



    private void JavaCoffee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Café! ☕");
        System.out.println("Choose your drink, type number 1,2,3 or 4: ");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Juice");
        System.out.println("4. Water");
        int choice = isValidNumber3(scanner);
        String result = switch (choice){
            case 1 ->{
                yield "You chose Coffee. Price: $2.00";
            }
            case 2->{
                yield "You chose Tea. Price $3.00";
            }
            case 3->{
                yield "You chose Juice. Price $2.50";
            }
            case 4->{
                yield "You chose Water. Price $1.00";
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
        System.out.println(result);
    }

    private void basicCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = isValidNumber(scanner);
        System.out.println("Enter number b, different than zero: ");
        int b = isValidNumber2(scanner);
        System.out.println("Do you want to add, subtract, multiply or divide");
        String answer = scanner.nextLine();
        String result = switch (answer){
            case "add" -> {
                System.out.println(addition(a,b));
                yield "add";
            }
            case "subtract" ->{
                System.out.println(subtraction(a,b));
                yield "subtract";
            }
            case "divide"->{
                System.out.println(division(a,b));
                yield "division";
            }
            case "multiply"->{
                System.out.println(multiplication(a,b));
                yield "multiplication";
            }

            default -> throw new IllegalStateException("Unexpected value: " + answer);
        };


    }

    private int addition(int a, int b){
        return a+b;
    }

    private int multiplication(int a, int b){
        return a*b;
    }

    private int subtraction(int a, int b){
        return a-b;
    }

    private double division(int a, int b){
        if(b==0){
            throw new ArithmeticException("You cannot divide by zero!");
        }else {
            return (double) a/b;
        }
    }

    @SuppressWarnings("unused")
    private void animationLauncher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to run animation with lemon, clover or leaf ? ");
        String animation = scanner.nextLine();
        String result;

        result = switch (animation){
            case "leaf" -> {AnimationLauncher.runHerbalLeaf();yield "leaf";}
            case "lemon" ->{AnimationLauncher.runLemon();yield "lemon";}
            case "clover"->{AnimationLauncher.runClover();yield "clover";}
            default -> throw new IllegalStateException("Unexpected value: " + animation);
        };

        System.out.println(result);

    }

    @SuppressWarnings("unused")
    private void drinkManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what do you want to drink? (tea, coffee, water)");
        String abstractDrink = scanner.nextLine();
        String drink = switch (abstractDrink){
            case "tea" -> "You chose tea.";
            case "coffee" -> "You chose coffee";
            case "water" ->"You chose water";
            default -> throw new IllegalStateException("Unexpected value: " + abstractDrink);
        };
        System.out.println(drink);
    }

    @SuppressWarnings("unused")
    private void daysOfWeek() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number between 1 and 7 ");
    int number = isValidNumber(scanner);
    String result = switch (number){
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> throw new IllegalStateException("Unexpected value: " + number);
    };
    System.out.println(result);
    }

    private int isValidNumber3(Scanner scanner){
        boolean isValid = true;
        int number = 0;
        while (isValid){
            try{
                String string = scanner.nextLine();
                number = Integer.parseInt(string);
                if(number>0 && number<5){
                    isValid=false;
                }else {
                    System.out.println("Please choose the number between 1,2,3 or 4: ");
                }
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
        return number;
    }

    private int isValidNumber2(Scanner scanner){
        boolean isValid = true;
        int number = 0;
        while (isValid){
            try{
                String string = scanner.nextLine();
                number = Integer.parseInt(string);
                if(number!=0){
                    isValid=false;
                }else {
                    System.out.println("You can't divide by zero! Enter number different than zero: ");
                }
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter valid number: ");
            }
        }
        return number;
    }

    private int isValidNumber(Scanner scanner){
        boolean isValid = true;
        int number = 0;
        while (isValid){
             try{
                String string = scanner.nextLine();
                number = Integer.parseInt(string);
                isValid=false;
             }catch (NumberFormatException e){
                 System.out.println("This is not a number. Enter valid number: ");
             }
        }
        return number;
    }

    @SuppressWarnings("unused")
    private void switchExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want red, green or blue pencil ? ");
        String string =scanner.nextLine();
        String result = switch (string){
          case "red" -> "...you have chosen red, good choice";
          case  "blue"->"...it is very good you have chosen blue color";
          case "green"->"...it is perfect that you have chosen green";
          default -> "I believe that next time you will choose between these three colors";

        };
        System.out.println(result);
    }

    @SuppressWarnings("unused")
    private void switchOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to eat avocado or cucumber ? ");
        String choice = scanner.nextLine();
        String result = switch (choice) {
            case "avocado" -> "You have chosen avocado";
            case "cucumber" -> "You have chosen cucumber";
            default -> "This is either not cucumber or avocado.";
        };
        System.out.println(result);
    }


}
