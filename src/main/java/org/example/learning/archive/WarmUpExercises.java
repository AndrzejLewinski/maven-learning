package org.example.learning.archive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by User on 19.05.2025
 */
public class WarmUpExercises {

    public static final Logger logger = LoggerFactory.getLogger(WarmUpExercises.class);

    public static void main(String[] args) {

        WarmUpExercises warmUpExercises = new WarmUpExercises();
        warmUpExercises.logProgramStart();
        warmUpExercises.lambdaRepetitionStep7();

    }

    private void lambdaRepetitionStep7() {

        List<Integer> IntList02Modifiable  = new ArrayList<>(createListInteger());

        List<Integer> IntList_01      =  createListInteger();
        List<Double>  DoubleList_01   =  createListDouble();
        List<String>  StringList_01   =  createNameList();
        List<Object>  ObjectList_01   =  createObjectList();
        List<Object>  ObjectList_02   =  createArrayList();

        add42ToList(IntList02Modifiable);
        add42ToList(ObjectList_02);

        List<List<?>> objects = List.of(
                IntList02Modifiable,
                IntList_01,
                DoubleList_01,
                StringList_01,
                ObjectList_01,
                ObjectList_02
        );

        printListGenericAndSeparate(objects);
        printThisLineT("\n");
        printListWithSeparators(objects);

    }

    private void printListWithSeparators(List<List<?>> objects) {
        for (List<?> sublist : objects) {
            printThisLineT("");
            for (Object item : sublist) {
                printThisLineT("| " + item + " ");
            }
            printThisLineT("|");
            printThisLineT("\n");
        }
    }

    private void add42ToList(List<? super Integer> list){
        list.add(42);
    }
    private List<Object>  createObjectList(){
        return List.of("Andrzej",35,"niedźwiedź",5.0,true,Integer.MIN_VALUE,
                TimeUnit.MICROSECONDS);
    }
    private List<Object> createArrayList(){
        return new ArrayList<>(List.of("Niedźwiedź",42,true,Integer.MAX_VALUE));
    }
    private List<String> createNameList(){
        return List.of("Andrzej","Anna","Zenon");
    }
    private List<Integer> createListInteger(){
        return List.of(1, 2, 3, 4);
    }
    private List<Double> createListDouble(){
        return List.of(3.14, 2.71);
    }
    @SuppressWarnings("unused")
    public void printNumbers(List<? extends Number> list) {
        for (Number item : list) {
            System.out.print(item.doubleValue()+" ");  // Działamy na typach Number
        }
        printNewLineT("");
    }
    @SuppressWarnings("unused")
    public void printListWildCard(List<?> list) {
        for (Object item : list) {
            System.out.print(item+" ");  // Elementy traktowane są jako Object
        }
        printNewLineT("");
    }
    @SuppressWarnings("unused")
    public <T> void printListGeneric(List<T> list){
        for(Object item : list){
            printThisLineT(item+" ");
        }
    }

    public <T> void printListGenericAndSeparate(List<T> list) {
        for (Object item : list) {
            printThisLineT(item+" ");
        }
        printNewLineT("");
    }

    private <T> void printNewLineT(T element){
        System.out.println(element);
    }

    private <T> void printThisLineT(T element){
        System.out.print(element);
    }

    private <T extends Number> double doubleValue(T number){
        return number.doubleValue()*2;
    }

    @SuppressWarnings("unused")
    private void lambdaRepetitionStep6() {
        Function<String, Integer> stringLength = String::length;
       printThisLineT(stringLength.apply("Ala ma kota"));
       System.out.println();
       printThisLineT(doubleValue(5));
       printThisLineT(doubleValue(2));

    }

    private <T> void printFilterResult(Function<T,?> genericFunction, T genericInput){
        System.out.println(genericFunction.apply(genericInput));
    }

    private void printList(List<Integer> list){
        list.forEach(i-> System.out.print(i+" "));
    }

    private <T> void printPredicate(Predicate<T> predicate, T object){
        System.out.println(predicate.test(object));
    }

    @SuppressWarnings("unused")
    private void lambdaRepetitionStep5() {
        Function<Integer,Integer> integerFunction = i -> (int) Math.pow(i,2);
                
        printFilterResult(integerFunction,4);
        printFilterResult(integerFunction,5);

        System.out.println("...");
        printPredicate(i->i%2==0,15);
        printPredicate(i->i%2==0,12);

        System.out.println();

        List<Integer> collect = IntStream.range(0, 20).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        //we're using help method printList
        printList(collect);

        System.out.println();
        List<Integer> collect1 = collect.stream().filter(i->i%2==0).collect(Collectors.toList());
        printList(collect1);
        System.out.println();
        BiFunction<Integer,Integer,Integer> biFunction = Integer::sum;
        System.out.println(biFunction.apply(4,5));

        Function<String,String> str = String::toUpperCase;
        System.out.println(str.apply("ala ma kota"));

        System.out.println("...");

        printPredicate(i->i>10,15);
        printPredicate(i->i>10,2);
        System.out.println();

        List<Integer> collect2 = IntStream.range(0, 20).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        List<Integer> collect3 = collect2.stream().map(i -> i * i).collect(Collectors.toList());
        printList(collect3);

        System.out.println("\n...");
        printPredicate(String::isEmpty,"Whatever");
        printPredicate(String::isEmpty,"");

    }

    @SuppressWarnings("unused")
    private void lambdaRepetitionStep4() {
        List<Integer> collect = IntStream.range(0, 5).boxed().collect(Collectors.toList());
        collect.forEach(i-> System.out.print(i+" "));
        int sum1 = collect.stream().mapToInt(Integer::intValue).sum();
        System.out.println();
        System.out.println("sum = "+sum1);
        System.out.println();
        Optional<Integer> sum = collect.stream().reduce(Integer::sum);
        sum.ifPresent(i-> System.out.println("sum = "+i));
    }

    @SuppressWarnings("unused")
    private void lambdaRepetitionStep3() {
        Function<String,String> reverseString = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverseString.apply("snowboard"));
    }

    @SuppressWarnings("unused")
    private void lambdaRepetitionStep2() {
        //filtering
        Predicate<Integer> isEven = integer -> integer%2==0;
        Predicate<Integer> isBiggerThanFive = integer -> integer>5;
    }

    @SuppressWarnings("unused")
    private void lambdaRepetitionStep1() {
        BiFunction<Integer,Integer,Integer> addition = Integer::sum;
        System.out.println(addition.apply(2,3));
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
                printNewLineT("Enter a valid number: ");
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
            System.out.println("Jesteś niepełnoletni");
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
