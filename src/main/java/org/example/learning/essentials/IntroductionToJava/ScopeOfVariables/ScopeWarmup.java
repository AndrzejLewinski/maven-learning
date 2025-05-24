package org.example.learning.essentials.IntroductionToJava.ScopeOfVariables;

/**
 * Created by User on 24.05.2025
 */
public class ScopeWarmup {

    static int x = 10;
    static int count = 100;


    public static void main(String[] args) {

        ScopeWarmup scopeWarmup = new ScopeWarmup();
        scopeWarmup.exercise1();

    }

    private void exercise1() {

        for(int i = 0; i<3; i++){
            @SuppressWarnings("UnnecessaryLocalVariable") int count = i; //shadowing pola klasy count
            System.out.print(count+" ");
        }
        System.out.println();
        System.out.println(count); // statyczne pole klasy

    }

    @SuppressWarnings("unused")
    private void exercise0() {
        {
            int x =5; //shadowing pola klasy x
            System.out.println(x); //wypisze 5 (lokalna zmienna)
        }
        System.out.println(x); //wypisze 10 (statyczne pole klasy)

        System.out.println("Scope warmup complete");
    }
}
