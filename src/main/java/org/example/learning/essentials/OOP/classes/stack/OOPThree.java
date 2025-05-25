package org.example.learning.essentials.OOP.classes.stack;

/**
 * Created by User on 25.05.2025
 */
public class OOPThree {

    public static void main(String[] args) {

        Monkey monkey = new Monkey("Zippy");
        monkey.eat();
        TalkingMonkey talkingMonkey = new TalkingMonkey("Bongo");
        Monkey.Banana banana = new Monkey.Banana(true);
        talkingMonkey.speak();
        talkingMonkey.eatBanana(banana);
        monkey.eatBanana(banana);

    }

    private interface Animal{
        @SuppressWarnings("unused")
        void speak();

    }

    private interface Food{
        @SuppressWarnings("unused")
        void eat();
    }

    private static class TalkingMonkey extends Monkey{

        public TalkingMonkey(String name) {
            super(name);
        }

        @Override
        public void speak() {
            super.speak();
            String introducing = "Hello I'm " + getName();
            System.out.println(introducing);
        }

    }


    private static class Monkey implements Animal{
        private final String name;

        @Override
        public void speak() {
            //noinspection SpellCheckingInspection
            System.out.println("uuuaa uaaa");
        }

        public Monkey(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(name+" is eating.");
        }

        public void eatBanana(Banana banana){
            if(banana.ripe){
                System.out.println("Monkey "+name+" is eating banana.");
            }else {
                System.out.println("Monkey "+name+" refuses to eat banana");
            }
        }

        public String getName() {
            return name;
        }

        private static class Banana implements Food{

            boolean ripe;

            @Override
            public void eat() {
                if(ripe){
                    System.out.println("Yummy!");
                }else {
                    System.out.println("Too sour!");
                }
            }

            public Banana(boolean ripe) {
                this.ripe = ripe;
            }
        }
    }
}
