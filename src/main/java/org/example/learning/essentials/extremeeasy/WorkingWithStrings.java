package org.example.learning.essentials.extremeeasy;

import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Scanner;

/**
 * Created by User on 21.05.2025
 */
public class WorkingWithStrings {


    private static final Logger logger = LoggerFactory.getLogger(WorkingWithStrings.class);


    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();
        //
        //exercise8();
        exercises();
    }

    @SuppressWarnings("unused")
    private static void exercise8() {

        StringBuilder stringBuilder = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter example text: ");
        String exampleString = scanner.nextLine();
        char[] charArray = exampleString.toCharArray();
        for(int i = charArray.length-1;i>=0;i--){
            Character character = charArray[i];
            stringBuilder.append(character).append(" ");
        }
        ///
        ///
        /// String text = "Bazylia";
        /// char[] reversed = text.toCharArray();
        /// for (int i = reversed.length - 1; i >= 0; i--) {
        ///     Character character = reversed[i];
        ///     System.out.print(character+" ");
        /// }

        System.out.println();
        String string = stringBuilder.toString();
        System.out.println(string);

    }

    private static void exercises() {
        Scanner scanner = new Scanner(System.in);
        PrintUtils.printLine("Enter name: ");
        String name = scanner.nextLine();
        PrintUtils.printLine("Enter surname: ");
        String lastname = scanner.nextLine();
        System.out.println("Witaj "+name+" "+lastname);
        PrintUtils.printLine("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Twoje imię ma : "+name.length()+" znaków.");
        PrintUtils.printLine("Enter any text: ");
        String text = scanner.nextLine();
        System.out.println(text+" -> "+text.toUpperCase());
        PrintUtils.printLine("Enter any text: ");
        text = scanner.nextLine();
        System.out.println(text+" -> "+text.toLowerCase());
        PrintUtils.printLine("Enter name: ");
        name = scanner.nextLine();
        System.out.println(name.charAt(0));
        PrintUtils.printLine("Enter name: ");
        name = scanner.nextLine();
        System.out.println(name.charAt(name.length()-1));
        PrintUtils.printLine("Enter first text: ");
        name = scanner.nextLine();
        PrintUtils.printLine("Enter second text: ");
        lastname = scanner.nextLine();
        System.out.println(name+lastname);

        PrintUtils.printLine("Enter any text sentence: ");
        text = scanner.nextLine();
        PrintUtils.printLine("Enter any word: ");
        name = scanner.nextLine();
        if(text.contains(name)){
            System.out.println("Zdanie "+text+" zawiera słowo "+name);
        }else {
            System.out.println("Zdanie "+text+" nie zawiera słowa "+name);
        }

        PrintUtils.printLine("Enter first text: ");
        name =scanner.nextLine();
        PrintUtils.printLine("Enter second text: ");
        lastname=scanner.nextLine();

        if(name.equals(lastname)){
            System.out.println("napisy są sobie równe");
        }else {
            System.out.println("Napisy nie są sobie równe");
        }


    }
}
