package org.example.learning.essentials.IntroductionToJava.Exercises;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 21.05.2025
 */
public class ControlFlowBasics {


    private static final Logger logger = LoggerFactory.getLogger(ControlFlowBasics.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        new ControlFlowBasics().forLoop();

    }

    private void forLoop(){

        int counter =1;
        while (counter<=5){
            PrintUtils.printThreeVariables(counter," ","");
            counter++;
        }
        PrintUtils.printEmptyLine();
        int sum = 0;
        for(int i =0;i<5;i++){
            sum+=i;
        }
        PrintUtils.printThreeVariables("sum = ",sum,"\n");
        for(int i =0;i<10;i++){
            PrintUtils.printIntegerWithSpace(i);
        }
        PrintUtils.printEmptyLine();
        IntStream.range(0,10).forEach(PrintUtils::printIntegerWithSpace);
        List<Integer> collect = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        PrintUtils.printEmptyLine();
        collect.forEach(PrintUtils::printIntegerWithSpace);
    }

    private void switchDay(int day){
        String result = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown day";
        };
        PrintUtils.printStringWithSpace(result);
    }

    private boolean ifPositiveNumber(int number){
        return number>0;
    }

    @SuppressWarnings("unused")
    private void exercise2(){
        new ControlFlowBasics().switchDay(5);
        new ControlFlowBasics().switchDay(4);
    }

    private void exercise1(int n){
        if(ifPositiveNumber(n)){
            PrintUtils.printlnStringLine("this is positive number");
        }else {
            PrintUtils.printlnStringLine("this number is not positive");
        }
    }

    @SuppressWarnings("unused")
    private void exercise0(){
        new ControlFlowBasics().exercise1(5);
        new ControlFlowBasics().exercise1(-5);
    }

    @SuppressWarnings("unused")
    private void switchExpression() {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        String dayName = switch (day) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nieznany dzień";
        };

        System.out.println(dayName);
    }


}
