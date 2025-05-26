package org.example.learning.essentials.OOP.stack;

/**
 * Created by User on 25.05.2025
 */
@SuppressWarnings("unused")
public class OOPFive {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(100);
        System.out.println(account.getBalance());

    }

    private static class BankAccount {
        //klasyczna enkapsulacja

        private int balance;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            if (amount > 0) balance += amount;
        }

        public void withdraw(int amount){
            if(balance>amount){
                balance-=amount;
            }
        }
    }

    public static void operation() {
        //Enkapsulacja to kontrola dostępu i ukrywanie detali implementacyjnych

        //ograniczenie widoczności i zasięgu klasy — co jest jednym z elementów enkapsulacji
        //nie jes to enkapsulacja w klasycznym sensie

        //lokalna klasa localTool
        //noinspection GrazieInspection
        class LocalTool {
            void run() {
                System.out.println("run");
                //lokalna klasa HelloClass zadeklarowana wewnątrz metody run()
                //klasa w klasie w metodzie - każda żyje tylko wewnątrz swojego kontekstu
                class HelloClass {
                 public String hello(){
                     return "hello ";
                  }
                  private String sayHello(){
                     return "Say Hello";
                  }
                }
                HelloClass testClass = new HelloClass();
                String hello = testClass.hello();
                String sayHello = testClass.sayHello();
                System.out.println(hello+ sayHello);
            }
        }
        new LocalTool().run();
    }

    private void description(){

        //pola klasy prywatne — niedostępne z zewnątrz
        //publiczne metody gettery, settery — do odczytu i modyfikacji danych
        //ukrycie logiki wewnętrznej — reszta metod może być private lub protected

    }
}
