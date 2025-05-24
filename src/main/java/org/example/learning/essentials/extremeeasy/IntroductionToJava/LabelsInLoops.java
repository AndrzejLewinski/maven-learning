package org.example.learning.essentials.extremeeasy.IntroductionToJava;

import org.example.animations.ResultAnimations;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 24.05.2025
 */
@SuppressWarnings("BreakStatementWithLabel")
public class LabelsInLoops {


    private static final Logger logger = LoggerFactory.getLogger(LabelsInLoops.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
         AnimationLauncher.runDots();
         AnimationLauncher.runHerbalLeaf();
        ///
        /// ResultAnimations.herbalLeaf("comment: ", "");

        LabelsInLoops labelsInLoops = new LabelsInLoops();
        labelsInLoops.exampleNine();

        logger.info("Finalizing resources...");
        logger.info("Application shutting down. Goodbye!");
    }

    private void exampleNine() {

        String[][] words = {
                {"dog", "cat"},
                {"bird", "elephant"},
                {"fish", "lion"}
        };

        boolean found = false;

        //noinspection LabeledStatement
        search:
        //noinspection ForLoopReplaceableByForEach
        for(int i =0;i<words.length;i++){
            for(int j =0;j<words[i].length;j++){
                    String temp = words[i][j];
                    System.out.print(temp+" ");
                    if(temp.contains("a")){
                        //System.out.println("➔  ✔");
                        System.out.println();
                        ResultAnimations.fourLeaf(" ✔","");
                        found = true;
                        //noinspection BreakStatement
                        break search;
                    }
            }
        }
        if(!found){
            System.out.println("✖");
        }
    }

    private void exampleEight() {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean found = false;
        //noinspection LabeledStatement
        label :
        //noinspection ForLoopReplaceableByForEach
        for(int i =0; i<numbers.length;i++){
            for(int j =0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
                if(numbers[i][j]==5){
                    System.out.println(" - > We've found 5 number");
                    found = true;
                    //noinspection BreakStatement
                    break label;
                }
            }
            System.out.println();
        }
        if(!found){
            System.out.println("We didn't found five");
        }
    }

    private void exampleSeven() {

        List<Map<String, Integer>> listOfMaps = new ArrayList<>();

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("one", 10);
        map1.put("two", 20);
        listOfMaps.add(map1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("three", 30);
        map2.put("four", 40);
        listOfMaps.add(map2);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("five", 50);
        map3.put("six", 60);
        listOfMaps.add(map3);

        //tutaj jest wartość, której szukamy
        String keyToFind = "four";

        search:  // label dla zewnętrznej pętli
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < listOfMaps.size(); i++) {
            //wyciągamy bieżącą mapę z listy map
            Map<String, Integer> currentMap = listOfMaps.get(i);

            //wyciągamy klucz z bieżącej mapy
            for (Map.Entry<String, Integer> entry : currentMap.entrySet()) {
                System.out.println("Sprawdzam klucz: " + entry.getKey());

                //jeżeli klucz bieżącej mapy jest równy kluczowi, który chcemy znaleźć
                //ignorując wielkość znaków , to przerywamy label
                if (entry.getKey().equalsIgnoreCase(keyToFind)) {
                    System.out.println("Znalazłem " + keyToFind + " z wartością: " + entry.getValue());
                    //noinspection BreakStatement
                    break search;  // Przerywamy obie pętle, bo znaleźliśmy klucz
                    //bez label // z label kończymy na kluczu numer cztery
                    //Sprawdzam klucz: six
                    //Sprawdzam klucz: five
                }
            }
        }

        System.out.println("Koniec programu");

    }

    private void exampleSix() {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 10);
        map.put("two",20);
        map.put("three",30);
        map.put("four",40);
        map.put("five",50);


        for(Map.Entry<String,Integer> eachElement : map.entrySet()){
            System.out.println(eachElement.getKey()+" "+eachElement.getValue());
            if(eachElement.getKey().equalsIgnoreCase("one")){
                System.out.println("Value of key number one is "+eachElement.getValue());
                //noinspection BreakStatement
                break;
            }
        }

    }

    private void exampleFive() {

        int[][] numbers = {
                {10, 13, 19},
                {22, 35, 17},
                {5, 9, 14}
        };

        boolean found = false;

        //noinspection LabeledStatement
        search:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 7 == 0) {
                    System.out.println("Znalazłem liczbę podzielną przez 7: " + numbers[i][j] + " na pozycji [" + i + "][" + j + "]");
                    found = true;
                    //noinspection BreakStatement
                    break search;  // wyjście z obu pętli od razu
                }
            }
        }

        if (!found) {
            System.out.println("Nie znaleziono liczby podzielnej przez 7.");
        }

    }

    @SuppressWarnings({"ContinueStatementWithLabel", "BreakStatement"})
    private void forthExample() {

        //noinspection LabeledStatement
        outer:
        for (int i = 1; i <= 4; i++) {
            //noinspection LabeledStatement
            inner:
            for (int j = 1; j <= 4; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking out of outer loop when i * j = " + (i * j));
                    break outer;  // przerwij całą pętlę outer, gdy spełniony warunek
                }
                if (j == 2) {
                    System.out.println("Continue inner loop at i = " + i + ", j = " + j);
                    //noinspection ContinueStatement
                    continue inner;  // pomiń resztę iteracji wewnętrznej pętli dla tego j=2
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Koniec programu");

    }

    @SuppressWarnings({"LabeledStatement", "BreakStatement"})
    private void thirdExample() {
        outerLoop:  // label dla zewnętrznej pętli
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j == 3) {
                    System.out.println("Break outer loop at i=" + i + ", j=" + j);
                    break outerLoop;  // przerwij całą pętlę oznaczoną etykietą outerLoop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Koniec programu");
    }

    @SuppressWarnings("ContinueStatement")
    private void secondExample() {

        //noinspection LabeledStatement
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 3) {
                    //noinspection ContinueStatementWithLabel
                    continue outer;  // pomiń resztę i przejdź do kolejnej iteracji pętli outer
                    // if j==3
                    //i = 3, j = 1
                    //i = 3, j = 2
                    //czyli w momencie, którym już to j jet 3 to nie pozwala działać dalej
                    //i przechodzi na początek działania po label

                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Koniec programu");

    }

    private void firstExample() {


        //noinspection LabeledStatement
        outerLoop:
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <=3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 2) {
                    //noinspection BreakStatement
                    break outerLoop;
                    // gdyby nie break 'outerLoop' (label) dalej by było
                    //....
                    //i = 3, j = 1
                    //i = 3, j = 2
                    //i = 3, j = 3
                    //break;
                    // Zwykły break daje coś takiego
                    // ....
                    // i = 3, j = 1
                    // i = 3, j = 2
                }
            }
        }
        System.out.println("Koniec programu");




    }


}
