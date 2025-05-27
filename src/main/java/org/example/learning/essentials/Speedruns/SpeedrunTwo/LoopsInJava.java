package org.example.learning.essentials.Speedruns.SpeedrunTwo;

/**
 * Created by User on 27.05.2025
 */
public class LoopsInJava {

    private static final LoopsInJava instance = new LoopsInJava();

    public static LoopsInJava getInstance() {
        return instance;
    }

    private LoopsInJava() {
    }

    public void loops(){
        System.out.println();
        for(int i =0;i<5;i++){
            System.out.print(i+1+" ");
        }
        System.out.println();
        int number = 0;
        do{
            System.out.print(number+1+" ");
            number++;
        }while (number<5);
        int counter =0;
        System.out.println();
        while (counter<5){
            System.out.print(counter+1+" ");
            counter++;
        }
        System.out.println();
    }
}
