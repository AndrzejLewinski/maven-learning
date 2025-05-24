package org.example.learning.essentials.IntroductionToJava.Exercises;

/**
 * Created by User on 24.05.2025
 */
public class NestedLoops {
    public static void main(String[] args) {

        exercise5();

    }
    private static void exercise5() {
        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                if(j==i){
                    System.out.print("✖ ");
                }else {
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }
    private static void exercise4() {
       for(int i = 1; i<=12; i++){
           System.out.print(i+" ");
           if(i%3==0){
               System.out.println();
           }
       }
    }
    private static void exercise3() {

        for(int i =0;i<6;i++){
            System.out.print("("+i+")");
            for(int j =0;j<6;j++){
                if(i==0){
                    System.out.print("("+j+")");
                }else {
                    System.out.print(" "+i*j+" ");
                }
            }
            System.out.println();
        }

    }
    private static void exercise2() {

        for(int i =0;i<5;i++){
            System.out.print("("+i+")");
            for(int j =0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    private static void exercise1() {

        for(int i =0;i<7;i++){
            System.out.print("("+i+")");
            for(int j =0;j<5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
