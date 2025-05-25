package org.example.learning.essentials.OOP.classes.records;

/**
 * Created by User on 25.05.2025
 */
class OOPOne {

    public static void main(String[] args) {
        Dog burek = new Dog("burek",3);
        burek.bark();
    }

    private static class Dog{

        private String name;
        private int age;

        void bark(){
            System.out.println("woof");
        }

        Dog(String name,int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}

