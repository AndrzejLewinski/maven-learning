package org.example.learning.essentials.extremeeasy;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by User on 21.05.2025
 */
public class BasicInputOutput {

    private static final Logger logger = LoggerFactory.getLogger(BasicInputOutput.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        ///AnimationLauncher.runHerbalLeaf();
        ///AnimationLauncher.runClover();
        AnimationLauncher.runLemon();

        //new BasicInputOutput().enterYourName();

        new BasicInputOutput().exercises();

    }

    private void exercises(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        PrintUtils.printThreeVarAnimations("Hey, ",name,"! \n");

    }

    @SuppressWarnings("unused")
    private void exerciseHelloWorld(){
        System.out.println("Hello World!");
    }

    @SuppressWarnings("unused")
    private void enterYourName(){
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        String name = "";
        while (condition){
            PrintUtils.printlnStringLine("Enter your name: ");
            name = scanner.nextLine();

            if(!name.isEmpty() && isStringContainsLettersOnly3(name)){
                condition=false;
            }else {
                System.out.println("This string does not contains letters only. Please enter valid name: ");
            }
        }
    }

    @SuppressWarnings("unsed")
    private static boolean isStringContainsLettersOnly3(String string){
        return string.chars().allMatch(c -> Character.isLetter(c) || c == ' ');
    }

    @SuppressWarnings("unused")
    private static boolean isStringContainsLettersOnly(String string){
        int counter = 0;
        char[] charArray = string.toCharArray();
        for(char c: charArray){
            if(Character.isLetter(c) || c==' '){
                counter++;
            }
        }
        return counter == string.length();
    }

    @SuppressWarnings("unused")
    private static boolean ifStringContainsLettersOnly1(String input){
        char[] charArray = input.toCharArray();
        for(char c : charArray){
            if(!Character.isLetter(c) && c !=' '){
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
    private boolean isLetterOrSpace(char c){
        return Character.isLetter(c) || c == ' ';
    }

    @SuppressWarnings("unused")
    private void smallTests(){
        //char validation
        char procent = '%';
        PrintUtils.printlnObject(procent);
        PrintUtils.printlnObject(new BasicInputOutput().isLetterOrSpace(procent));
        PrintUtils.printlnObject(new BasicInputOutput().isLetterOrSpace('a'));

        String name = "Grzegorz";
        char[] charArray = name.toCharArray();
    }
}
