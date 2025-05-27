package org.example.learning.essentials.Speedruns.SpeedrunTwo;

/**
 * Created by User on 27.05.2025
 */
public class VariablesAndDataTypes {

    int age;
    double weight;
    boolean isAdult;
    String name;
    char firstLetterInName;




    private static final VariablesAndDataTypes instance = new VariablesAndDataTypes();

    public static VariablesAndDataTypes getInstance() {
        return instance;
    }

    private VariablesAndDataTypes() {
    }

    public void printVariables(){
        age = 20;
        weight = 110.2;
        isAdult = true;
        name = "Ziggy";
        firstLetterInName = 'a';
        String string = age + " " + weight + " " + isAdult + " " + name + " " + firstLetterInName;
        System.out.println(string);
    }


}
