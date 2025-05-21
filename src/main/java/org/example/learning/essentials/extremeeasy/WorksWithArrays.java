package org.example.learning.essentials.extremeeasy;
import org.example.learning.utils.PrintUtils;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by User on 21.05.2025
 */
public class WorksWithArrays {

    private static final Logger logger = LoggerFactory.getLogger(WorksWithArrays.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///  AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        ///  AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();


        WorksWithArrays worksWithArrays = new WorksWithArrays();
        worksWithArrays.exercise11();

    }

    private void exercise11() {




    }

    private void exercise10() {

        List<Integer> collect =
                IntStream.range(0, 100).map(i -> ThreadLocalRandom.current().nextInt(10)).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printIntegerWithSpace);
        List<Integer> collect1 = collect.stream().sorted().collect(Collectors.toList());
        PrintUtils.printEmptyLine();
        collect1.forEach(PrintUtils::printIntegerWithSpace);

        //indeks 0, ... ,indeks 9
        //do każdego indeksu tablicy będzie przyporządkowana ilość wystąpień danej liczby
        //
        int[] tab = new int[10];

        for(Integer integer : collect1){
            for(int i =0;i<collect1.size();i++){
                if(integer.equals(i)){
                    tab[i]+=1;
                }
            }
        }
        PrintUtils.printEmptyLine();
        for(Integer integer : tab){
            PrintUtils.printIntegerWithSpace(integer);
        }

        int[] counts = new int[10];

        for (Integer number : collect) {
            counts[number]++;
        }
        PrintUtils.printEmptyLine();

        for (int i = 0; i < counts.length; i++) {
            System.out.println("Liczba " + i + " występuje: " + counts[i] + " razy.");
        }



    }

    @SuppressWarnings("unused")
    private void exercise9() {

        List<Integer> collect = IntStream.range(0,100).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printIntegerWithSpace);
        Stream<Integer> sorted = collect.stream().sorted();
        PrintUtils.printEmptyLine();
        sorted.forEach(PrintUtils::printIntegerWithSpace);
        PrintUtils.printEmptyLine();
        List<Integer> collect1 = collect.stream().distinct().collect(Collectors.toList());
        Stream<Integer> sorted1 = collect1.stream().sorted();
        sorted1.forEach(PrintUtils::printIntegerWithSpace);
        PrintUtils.printEmptyLine();

        int[] array = new int[100];
        for(int i =0;i<collect.size();i++){
            array[i]=collect.get(i);
            PrintUtils.printIntegerWithSpace(array[i]);
        }

        int temp = array[0];
        int temp2 = array[array.length - 1];

        array[0] = temp2;
        array[array.length-1]=temp;

        PrintUtils.printEmptyLine();

        for (int j : array) {
            PrintUtils.printIntegerWithSpace(j);
        }



    }
    @SuppressWarnings("unused")
    private void exercise8() {
        List<Integer> collect = IntStream.range(0, 100).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printIntegerWithSpace);
        Collections.shuffle(collect);
        PrintUtils.printEmptyLine();
        //it works
        collect.forEach(PrintUtils::printIntegerWithSpace);
        PrintUtils.printEmptyLine();

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < collect.size(); i++) {
            Integer integer = collect.get(i);
            PrintUtils.printIntegerWithSpace(integer);
            if (integer > max) {
                max = integer;
                index = i;
            }
        }
        PrintUtils.printDoubleEmptyLine();
        PrintUtils.printLine("index = "+index+" : max = "+max);


    }

    @SuppressWarnings("unused")
    private void exercise7() {

        List<Integer> collect = IntStream.range(0, 100).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        int sum = collect.stream().mapToInt(Integer::intValue).sum();
        int avg = sum /collect.size();
        List<Integer> collect1 = collect.stream().filter(i -> i > avg).mapToInt(Integer::intValue).boxed().collect(Collectors.toList());
        collect1.forEach(PrintUtils::printIntegerWithSpace);


    }

    @SuppressWarnings("unused")
    private void exercise6() {
        List<Integer> collect =
                IntStream.range(0, 100)
                        .map(i -> ThreadLocalRandom.current().nextInt(5))
                        .boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printObjectWithSpace);
        System.out.println();
        //collect.stream().sorted().forEach(PrintUtils::printObjectWithSpace);
        PrintUtils.printEmptyLine();
        int[] tab = new int[100];
        //Kopiujemy zawartość listy do tablicy i wypisujemy elementy
        for(int i =0;i<tab.length;i++){
            tab[i]=collect.get(i);
            PrintUtils.printObjectWithSpace(tab[i]);
        }
        for (int j = 0; j <= tab.length-1; j++) {
            for (int i = 0; i <= tab.length-2; i++) {//5-2 = 3 porównujemy indeks 3 z indeksem 4
                if (tab[i] > tab[i + 1]){
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Liczba 4 do przebadania");
        System.out.println();
        int counter = 0;
        for (int j : tab) {
            if (j == 4) {
                counter++;
            }
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("4 exist each "+counter+" times in the table");
    }

    @SuppressWarnings("unused")
    private void exercise4() {
        List<Integer> collect = IntStream.range(0, 100).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printObjectWithSpace);
        PrintUtils.printEmptyLine();
        int[] tab = new int[100];
        for(int i =0;i<tab.length;i++){
            tab[i]=collect.get(i);
            PrintUtils.printObjectWithSpace(tab[i]);
        }
        System.out.println();
        int[] rev = new int[100];
        for (int i = 0; i < tab.length; i++) {
            rev[i] = tab[tab.length - 1 - i];
            System.out.print(rev[i] + " ");
        }
    }
    @SuppressWarnings("unused")
    private void exercise3() {
        //Tworzymy listę losowych liczb w przedziale od 0 do 99
        List<Integer> collect = IntStream.range(0, 100).map(i -> ThreadLocalRandom.current().nextInt(100)).boxed().collect(Collectors.toList());
        collect.forEach(PrintUtils::printObjectWithSpace);
        PrintUtils.printEmptyLine();
        int[] tab = new int[100];
        //Kopiujemy zawartość listy do tablicy i wypisujemy elementy
        for(int i =0;i<tab.length;i++){
            tab[i]=collect.get(i);
            PrintUtils.printObjectWithSpace(tab[i]);
        }
        PrintUtils.printEmptyLine();
        //
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : tab) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
            if (j % 2 == 0) {
                System.out.print(j + " ");

            }
        }
        PrintUtils.printEmptyLine();
        PrintUtils.printlnObject(max);
        PrintUtils.printlnObject(min);
        collect.stream().sorted().forEach(PrintUtils::printObjectWithSpace);
        PrintUtils.printEmptyLine();
    }
    @SuppressWarnings("unused")
    private void exercise2() {
        int[] tab = new int[100];
        int sum = 0;
        for(int i =0;i<100;i++){
            tab[i]=i+1;
            sum+=tab[i];
            int x = tab[i];
            if(x%2==0){
                System.out.print(tab[i]+" ");
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println((double) sum/tab.length);
    }
    @SuppressWarnings("unused")
    private void exercise1() {
        WorksWithArrays worksWithArrays = new WorksWithArrays();
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[5];
        for(int i =0;i<5;i++){
            int a = worksWithArrays.isValid(scanner);
            tab[i]=a;
        }
        for(Integer integer : tab){
            PrintUtils.printIntegerWithSpace(integer);
        }
    }
    @SuppressWarnings("unused")
    private void exercise0() {
        int[] tab = new int[5];
        for(int i = 0;i <tab.length;i++){
            tab[i] = i+1;
            PrintUtils.printObjectWithSpace(tab[i]);
        }
    }
    private int isValid(Scanner scanner){
        int result = 0;
        boolean isValid = true;
        while (isValid){
            System.out.print("Enter number: ");
            try{
                String value = scanner.nextLine();
                result = Integer.parseInt(value);
                isValid = false;
            }catch (NumberFormatException e){
                System.out.println("This is not a number. Enter a valid number: ");
                scanner.nextLine();
            }
        }
        return result;
    }
}
