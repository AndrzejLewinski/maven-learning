package org.example.miniprojects;

import org.example.animations.ResultAnimations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 24.05.2025
 */
public class SimpleCalculator {


    private static final Logger logger = LoggerFactory.getLogger(SimpleCalculator.class);

    public static void main(String[] args) {

        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        //ResultAnimations.dotsAnimation("(","");
        SimpleCalculator simpleCalculator = new SimpleCalculator();


        simpleCalculator.countAverage();
        //ResultAnimations.dotsAnimation("",")");
        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");

    }

    private void countAverage(){
        ResultAnimations.dotsAnimation("Starting application","");
        ResultAnimations.herbalLeaf("", "");
        System.out.println();


        //We need to declare simpleCalculator object because we will use other methods in this class
        SimpleCalculator simpleCalculator  = new SimpleCalculator();

        //We need to create scanner object currently right now, because we need to input grades into the list
        Scanner scanner = new Scanner(System.in);

        //Creating list of Integers which will allow us to aggregate each grade in this list
        List<Integer> collect = new ArrayList<>();
        for(int i = 0;i<3;i++){
            //we are reading grades by using .readIntegerInRange method
            int eachGrade = simpleCalculator.readIntegerInRange(scanner, 1, 5);
            //we are adding those grades into the list
            collect.add(eachGrade);
        }

        //We are counting average by using method
        double doubleAvg = simpleCalculator.generateAverage(collect);

        //We are getting text description for average grades
        String grade = simpleCalculator.getGradeDescription(doubleAvg);

        //We're printing everything in one line
        System.out.print("\nGrades: ");
        //We are printing out each grade
        collect.forEach(i-> System.out.print(i+" "));
        //We are printing average of our grades and text description of it which is meaning of the grades
        System.out.print(" Average of your grades is: "+doubleAvg+", which means it is: "+grade+" grade.");
        System.out.println();
        ResultAnimations.dotsAnimation("Cleaning data.", "");
        ResultAnimations.lemon("Closed all processes", "✅");
    }

    private String getGradeDescription(double average) {
        String grade;
        //noinspection IfStatementWithTooManyBranches
        if(average>4.5){
            grade = "Very good";
        }else if(average>=3.5 && average<4.5){
            grade = "Good";
        }else if(average>=2.5 && average<3.5){
            grade = "Enough";
        }else {
            grade ="Not Enough";
        }
        return grade;
    }

    private double generateAverage(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    // int n = simpleCalculator.readIntegerInRange(scanner, 1, 5);
    @SuppressWarnings("SameParameterValue")
    private int readIntegerInRange(Scanner scanner, int lowerBound, int upperBound){
        System.out.println("Enter number in range: ");
        int result;
        while (true){
         try{
             String input = scanner.nextLine();
             result = Integer.parseInt(input);
             if(result>=lowerBound && result<=upperBound){
             return result;
             }else {
                 System.out.println("Number must be in range between "+lowerBound+" and "+upperBound);
             }
         }catch (NumberFormatException e){
             System.out.println("This is not a number! Please enter valid number: ");
         }
        }
    }
}
