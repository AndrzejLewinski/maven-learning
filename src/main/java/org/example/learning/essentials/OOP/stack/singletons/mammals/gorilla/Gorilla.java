package org.example.learning.essentials.OOP.stack.singletons.mammals.gorilla;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 27.05.2025
 */
public class Gorilla {


    public static void main(String[] args) {

        Gorilla gorilla1 = new Gorilla("____");
        Gorilla gorilla2 = new Gorilla("_**_");

        Gorilla.registerGorilla(gorilla1);
        Gorilla.registerGorilla(gorilla2);

        List<Gorilla> gorillas = Gorilla.getInstance().getGorillaList();
        gorillas.forEach(System.out::println);
        System.out.println(gorillas.get(0));

    }

    String name;

    public Gorilla(String name) {
        this.name = name;
    }

    private static volatile Gorilla instance;

   private static List<Gorilla> gorillaList = new ArrayList<>();

    public static Gorilla getInstance() {
           if(instance == null){
               synchronized (Gorilla.class){
                   if(instance==null){
                       instance= new Gorilla(); //kluczowa linijka kodu
                   }
               }
           }
           return instance;
    }

    public Gorilla() {
    }

    public void speak(){
        System.out.println(".");
    }

    public List<Gorilla> getGorillaList(){
        return gorillaList;
    }

    public static void registerGorilla(Gorilla gorilla){
        gorillaList.add(gorilla);
    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "name='" + name + '\'' +
                '}';
    }
}
