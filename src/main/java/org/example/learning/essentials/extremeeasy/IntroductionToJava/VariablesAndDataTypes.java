package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.learning.utils.ListUtils;
import org.example.learning.utils.PrintUtils;

import java.util.List;

/**
 * Created by User on 21.05.2025
 */
@SuppressWarnings("unused")
public class VariablesAndDataTypes {

    @SuppressWarnings("unused")
    private double rectangleArea(double a, double b){
        return a*b;
    }
    @SuppressWarnings("unused")
    private void isSunny(boolean isSunny){
        if(isSunny){
            PrintUtils.printlnStringLine("It's sunny!");
        }else {
            PrintUtils.printlnStringLine("It's not sunny!");
        }
    }

    @SuppressWarnings("unused")
    private void voidTasks(){
        char letter = 'A';
        boolean isLearningJava= true;
        String language = "Java";
        final int DAYS_IN_WEEK = 7;
        isSunny(true);
        isSunny(false);

        byte myByte = Byte.MAX_VALUE;
        short mShort = Short.MAX_VALUE;
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        float myFloat = Float.MAX_VALUE;
        char myChar = 'a';
        boolean trueValue = true;

        List<Object> list = List.of(myByte,mShort,myInt,myLong,myFloat,myChar,trueValue);
        ListUtils.printList(list);
        list.forEach(i->PrintUtils.printLine(i+" "));


    }
    @SuppressWarnings("unused")
    private int sum(int a, int b, int c){
        return a+b+c;
    }

    @SuppressWarnings("unused")
    private double piNumber(){
        return Math.PI;
    }

    @SuppressWarnings("unused")
    private int myAge(int age){
        return age;
    }

    @SuppressWarnings("unused")
    private static void helloWorld(){
        PrintUtils.printlnStringLine("Hello World!");
    }

    @SuppressWarnings("unused")
    private void answers(){
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(1),new VariablesAndDataTypes().myAge(15),"\n");
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(2),new VariablesAndDataTypes().piNumber(),"\n");
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(6),new VariablesAndDataTypes().sum(1,2,3),"\n");
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(8),new VariablesAndDataTypes().rectangleArea(4,5),"\n");

        new VariablesAndDataTypes().voidTasks();
    }

    @SuppressWarnings("unused")
    private void supressUnusedWarning(){
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(1),new VariablesAndDataTypes().myAge(1),"\n");
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(6),new VariablesAndDataTypes().sum(11,21,31),"\n");
        PrintUtils.printThreeVariables(new PrintUtils().getPrefix(8),new VariablesAndDataTypes().rectangleArea(14,15),"\n");
    }
}
