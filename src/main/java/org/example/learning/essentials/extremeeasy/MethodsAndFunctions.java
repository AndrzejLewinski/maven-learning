package org.example.learning.essentials.extremeeasy;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 21.05.2025
 */
public class MethodsAndFunctions {

    private static final Logger logger = LoggerFactory.getLogger(MethodsAndFunctions.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        ///AnimationLauncher.runHerbalLeaf();
          AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        new MethodsAndFunctions().printWelcome();
        new MethodsAndFunctions().printName("Bjoern");
        new MethodsAndFunctions().printName("Ivar");
        double result = new MethodsAndFunctions().squarePower(11);
        PrintUtils.printObjectWithSpace(result);
        PrintUtils.printEmptyLine();
        PrintUtils.printObject(new MethodsAndFunctions().average(1,3,5));
        PrintUtils.printEmptyLine();
        PrintUtils.printThreeVariables("Average of three numbers = ",new MethodsAndFunctions().average(1,2,3),"\n");

    }

    @SuppressWarnings("unused")
    public boolean isEven(int number){
        return number%2==0;
    }

    public double average(int a, int b, int c){
        int sum = a+b+c;
        return (double) sum/3;
    }

    @SuppressWarnings("unused")
    public double squarePower(int number){
        return (double) Math.pow(number,2);
    }

    @SuppressWarnings("unused")
    void printName(String name){
        PrintUtils.printStringWithSpace(name);
    }

    @SuppressWarnings("unused")
    void printWelcome(){
        PrintUtils.printStringWithSpace("Welcome to Java!");
    }



}
