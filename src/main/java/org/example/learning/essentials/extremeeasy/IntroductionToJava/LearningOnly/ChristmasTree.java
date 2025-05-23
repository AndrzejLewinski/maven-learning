package org.example.learning.essentials.extremeeasy.IntroductionToJava.LearningOnly;

import org.example.learning.utils.animations.launcher.AnimationLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by User on 23.05.2025
 */
@SuppressWarnings("unused")
public class ChristmasTree {

    private static final Logger logger = LoggerFactory.getLogger(ChristmasTree.class);

    public static void main(String[] args) {
        logger.info("🚀 Program starts...");
        ///AnimationLauncher.runDots();
        AnimationLauncher.runHerbalLeaf();
        /// runHerbalLeaf()prints double empty line at the end of the program
        ///AnimationLauncher.runClover();
        ///AnimationLauncher.runLemon();

        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.threeChristmasTreesBase();

    }


    private void threeChristmasTreesBase() {
        int n  = 5;
        char stair = '*';
        int  breaks = 1;
        int  multiply = 1;
        for(int i = n - 1; i >= 0; i--){

            int x = i+1;

            String input = String.valueOf(" ");

            //first block of code
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(input);
                }
            }
            //second block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            //third block of code
            for(int j=0;j<=i*2;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(input);
                }
            }
            //fourth block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            //5th block of code
            for(int j=0;j<=i*2;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(input);
                }
            }
            //fourth block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }

        for(int i =0;i<n*n;i++){
            System.out.print("-");
        }

        for(int i = 0; i < n; i++){

            int x = i+1;

            String input = String.valueOf(" ");

            //first block of code
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(input);
                }
            }
            //second block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            //third block of code
            for(int j=0;j<=i*2;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(input);
                }
            }
            //fourth block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            //5th block of code
            for(int j=0;j<=i*2;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(input);
                }
            }
            //fourth block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }


    private void exerciseEleven() {

        int n  = 5;
        char stair = '*';
        int  breaks = 1;
        int  multiply = 1;
        for(int i = n - 1; i >= 0; i--){
            //first block of code
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(i+1);
                }
            }
            //second block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }
            //third block of code
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(i+1);
                }
            }

            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }

    }

    private void exerciseTen() {

        int n  = 3;
        char stair = '*';
        int  breaks = 1;
        int  multiply = 1;
        for(int i = n - 1; i >= 0; i--){
            //first block of code
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(i+1);
                }
            }
            //second block of code
            for(int o=0; o<multiply; o++){
                for(int m=0; m<n*2-1-i*2; m++){
                    System.out.print(stair);
                }
            }

            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }


    private void exerciseNine() {
        int n  = 5;
        char stair = '@';
        int  breaks = 1;
        int  multiply = 1;
        for(int i = 0; i < n; i++){
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(i+1);
                }
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }

    private void exerciseEight() {
        int n  = 4;
        char stair = '@';
        int  breaks = 1;
        int  multiply = 1;
        for(int i = 0; i < n; i++){
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                    System.out.print(stair);
                }
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }

    private void exerciseSeven() {
        int n  = 5;
        char stair = '*';
        int  breaks = 2;
        int  multiply = 1;
        for(int i = n - 1; i >= 0; i--){
            for(int j=0;j<=i;j++){
                for(int m=0; m<multiply; m++){
                   System.out.print(stair);
               }
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }
    private void exerciseSix() {
        int n  = 5;
        char stair = '*';
        int  breaks = 1;
        int  multiply = 2;
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                for(int m =0;m<breaks*multiply;m++){
                    System.out.print(stair);
                }
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }

    private void exerciseFive() {
        int n  = 5;
        char stair = '*';
        int  breaks = 2;

        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(stair);
            }
            for(int m =0;m<breaks;m++){
                System.out.println();
            }
        }
    }
    private void exerciseFour() {
        int n  = 3;
        char stair = '#';

        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(stair);
            }
            System.out.println();
        }
    }
    private void exerciseThree() {
        int n  = 5;
        for(int i = n - 1; i >= 0; i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void exerciseTwo() {
        int n  = 5;
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void exerciseOne() {
        for(int i =0;i<5;i++){
            System.out.println("*");
        }
    }


}
