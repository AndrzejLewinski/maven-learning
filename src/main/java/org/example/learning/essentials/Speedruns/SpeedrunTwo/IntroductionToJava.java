package org.example.learning.essentials.Speedruns.SpeedrunTwo;

/**
* Created by User on 27.05.2025
*/public class IntroductionToJava {

    private static final IntroductionToJava instance = new IntroductionToJava();

    private IntroductionToJava() {
    }
    public static IntroductionToJava getInstance() {
        return instance;
    }
    public void print(){
        System.out.println("Java Speedrun: Extreme Easy - Step 1 complete! ✅");
    }
    public void helloWorld(){
        System.out.println("HelloWorld");
    }


}
