package org.example.learning.essentials.IntroductionToJava.Exercises.asciiLearning;
import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 23.05.2025
 */
public class AsciiLearningTwo {

    private static final Logger logger = LoggerFactory.getLogger(AsciiLearningTwo.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        /// runHerbalLeaf()prints double empty line at the end of the program
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        AsciiLearningTwo christmasTree = new AsciiLearningTwo();
        christmasTree.exercise5();
        christmasTree.exercise4();
        christmasTree.exercise3();
        christmasTree.exercise2();
        christmasTree.exercise1();
        christmasTree.exercise0();

    }

    private void exercise5() {
        int loopLength = 5;
        char sign = '*';
        char sign2 = '-';

        for (int i = 0; i < loopLength; i++) {
            System.out.print("("+i+") "); // prints the current row index (useful for debugging)
            // Spacje po lewej stronie
            for (int j = 0; j < loopLength - i - 1; j++) {
                System.out.print(sign2);
            }

            // Rysowanie środka
            for (int j = 0; j < 2 * i + 1; j++) {
                if(j==0 || j==2*i){
                    //bobki na choinkę
                    System.out.print("⭐");
                }else {
                    if(j%7==0){
                        System.out.print("🍀");
                    }else if(j%3==0){
                        System.out.print("🌿");
                    }else {
                        System.out.print(sign);
                    }
                }
            }
            // Spacje po prawej stronie
            for (int j = 0; j < loopLength - i-1; j++) {
                System.out.print(sign2);
                System.out.print(sign2);

            }
            System.out.println(); // nowa linia
        }
        System.out.println();
    }


    private void exercise4() {

        int loopLength = 5;
        char sign = '*';
        char sign2= '-';

        for(int i =0;i<loopLength;i++){ //  0,1,2,3,4 (loop runs 5 times)
            System.out.print("("+i+") "); // prints the current row index (useful for debugging)

            for(int j =loopLength-i-1;j>0;j--){ // for j<=i (j,i = 0),  prints (i + 1) "*" characters in each line
                System.out.print(sign2);
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(sign);
            }
            for(int j=loopLength-i-1;j>0;j--){
                System.out.print(sign2);
            }
            System.out.println(); // moves to the next line after printing stars
        }
        System.out.println();
    }

    private void exercise3() {

        int loopLength = 5;
        char sign = '*';

        for(int i =0;i<loopLength;i++){ //  0,1,2,3,4 (loop runs 5 times)
            System.out.print("("+i+") "); // prints the current row index (useful for debugging)

            for(int j =0;j<=i;j++){ // for j<=i (j,i = 0),  prints (i + 1) "*" characters in each line
                System.out.print(sign);
            }

            System.out.println(); // moves to the next line after printing stars
        }
        System.out.println();
    }

    private void exercise2() {

        char sign = '*';

        for(int i =0;i<3;i++){
            System.out.print("("+i+") ");
            for(int j =0;j<3;j++){
                System.out.print(sign);
            }
            System.out.println();
        }
        System.out.println();
    }

    private void exercise1() {
        char sign = '*';
        for(int i =0;i<5;i++)
            if(i==0){
                System.out.print("("+i+") ");
            }else {
                System.out.print(sign);
            }
        System.out.println();
    }

    private void exercise0() {
        char sign = '*';
        for(int i =0;i<5;i++) {
            System.out.print("("+i+") ");
            System.out.println(sign);
        }
    }
}
