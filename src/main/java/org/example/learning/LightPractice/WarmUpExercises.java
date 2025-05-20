package org.example.learning.LightPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by User on 19.05.2025
 */
public class WarmUpExercises {

    public static final Logger logger = LoggerFactory.getLogger(WarmUpExercises.class);

    public static void main(String[] args) {
        WarmUpExercises warmUpExercises = new WarmUpExercises();
        warmUpExercises.logProgramStart();

        warmUpExercises.run();

    }

    private void run() {
        System.out.println(1);
    }

    @SuppressWarnings("unused")
    private void runConsoleProgramStepThree() {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<3;i++){
            // program element
              boolean condition = true;
              while (condition){

                  System.out.println("Wypisz String dłuższy niż 5");
                  // validation
                  try{
                      String string = scanner.nextLine();
                      // key condition statement for this program
                      boolean keyCondition = string.length()>5;
                      if(keyCondition){
                          //if key condition statement for this program is true put data in map
                          map.put(string,string.length());
                          condition=false;
                      }else {
                          System.out.println("string must be greater than 5");
                      }
                  }catch (InputMismatchException e){
                      System.out.println("string must be greater than 5");
                      scanner.nextLine();
                  }
              }
        }// end of program element
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<String,Integer> eachElement : map.entrySet()){
            System.out.println(eachElement.getKey()+" -> "+eachElement.getValue());
            list.add(eachElement.getValue());
        }
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        collect.forEach(i-> System.out.print(i+" "));
        System.out.println();
        int[] tab = new int[3];
        for(int i =0;i<collect.size();i++){
            tab[i]=collect.get(i);
            System.out.print(tab[i]+" ");
        }
        int a  = tab[0];
        int b = tab[1];
        int c = tab[2];

        int max1 = Math.max(a,b);
        int max = Math.max(max1,c);

        System.out.println();
        //another option
        map.forEach((k,v)-> System.out.println(k+" -> "+v));
        System.out.println();
        String longestName = "";
        for(Map.Entry<String,Integer> eachElement : map.entrySet()){
            if(eachElement.getValue().equals(max)){
                longestName = eachElement.getKey();
            }
        }
        System.out.println("Longest name is : "+longestName);

    }

    @SuppressWarnings("unused")
    private void runConsoleProgramStepTwo(){
        Scanner scanner = new Scanner(System.in);
        String name = getNameFromUserForStepTwo(scanner);
        int age = getValidatedAge(scanner);
        boolean isAdult = isAdultForStepTwo(age);
        if(isAdult){
            System.out.println("Use is adult");
        }else {
            System.out.println("user is not adult");
        }
        Map<String,Integer> userMap = new LinkedHashMap<>();
        userMap.put(name,age);
        for(Map.Entry<String,Integer> eachMap : userMap.entrySet()){
            System.out.println(eachMap.getKey()+" "+eachMap.getValue());
        }
        System.out.println();
        userMap.forEach((key,value)-> System.out.println(key+" "+value));
    }

    private boolean isAdultForStepTwo(int number){
        return number>=18;
    }

    private String getNameFromUserForStepTwo(Scanner scanner){
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    private boolean isPositiveNumber(int number){
        return number>0;
    }

    private int getValidatedAge(Scanner scanner){
        System.out.println("Enter your age: ");
        int age;
        while (true){
            try{
                age =  scanner.nextInt();
                if(isPositiveNumber(age)){
                    return age;
                }else {
                    System.out.println("Age can't be negative number, enter a valid number: ");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter a valid numer: ");
                scanner.nextLine();
            }
        }
    }

    @SuppressWarnings("unused")
    private void runConsoleProgramStepOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = -1;
        boolean validationIfNumber = false;
        while (!validationIfNumber){
            try{
                age=scanner.nextInt();
                validationIfNumber = true;
            }catch (InputMismatchException e){
                System.out.println("Enter valid number: ");
                scanner.nextLine();
            }
        }
        boolean isAdult = validateAgeForStepOne(age);
        if(isAdult){
            System.out.println("Jesteś pełnoletni");
        }else {
            System.out.println("Jeseś niepełnoletni");
        }
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put(name,age);
        for(Map.Entry<String,Integer> eachMap : map.entrySet()){
            System.out.println(eachMap.getKey()+" "+eachMap.getValue());
        }
        scanner.close();
    }
    private boolean validateAgeForStepOne(int n){
        return n>=18;
    }

    private void logProgramStart() {
        logger.info("Program execution starts");
    }
}
