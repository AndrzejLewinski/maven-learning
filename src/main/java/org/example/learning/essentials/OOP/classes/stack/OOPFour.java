package org.example.learning.essentials.OOP.classes.stack;

import java.util.*;

/**
 * Created by User on 25.05.2025
 */
public class OOPFour {

    @SuppressWarnings("unused")
    private static class Person{

        private void use(){
            Person person = new Person("Jan");
            person.sayHello();

            Person person1 = new Person();
            person1.setName("Cezary");
            person1.sayHello();
        }

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public Person() {
        }

        void sayHello(){
            System.out.println("Hello my name is: "+name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @SuppressWarnings("unused")
    private static class Laptop{

        String brand;
        int ram;

        void use(){
            Laptop laptop = new Laptop("Toshiba",32);
            laptop.info();

        }
        public Laptop(String brand, int ram) {
            this.brand = brand;
            this.ram = ram;
        }

        void info(){
            System.out.println("Laptop brand: "+brand+", RAM: "+ram+" GB");
        }
    }

    @SuppressWarnings("unused")
    private static class Book{

        String title;
        String author;
        int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        // 🔁 Konstruktor kopiujący
        public Book(Book other) {
            this.title = other.title;
            this.author = other.author;
            this.year = other.year;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }
    }

    private static class Library{

        @SuppressWarnings("FieldMayBeFinal")
        private ArrayList<Book> books;


        //metoda zwraca książkę w sensie obiekt klasy Book
        public Book findBookByTitle(String title) {
            for (Book b : books) {
                if (b.title.equalsIgnoreCase(title)) {
                    return b; // Znaleziono książkę
                }
            }
            return null; // Nie znaleziono
        }


        public Library(){
            books = new ArrayList<>();
        }
        void addBook(Book b){
            Book copy = new Book(b);
            books.add(copy);
        }

        public void printAllBooks() {
            for (Book b : books) {
                System.out.println("Title: " + b.title + ", Author: " + b.author + ", Year: " + b.year);
            }
        }

        @SuppressWarnings("unused")
        public ArrayList<Book> getBooks() {
            return books;
        }
    }

    public static void main(String[] args) {

        Book book = new Book("cats","example autor",2025);
        Book book3 = new Book("cats1","anonymous autor",2025);
        Book book2 = new Book("cats2","obvious autor",2025);
        Book book4 = new Book("cats2","obvious autor",2025);
        Book book1 = new Book(book);
        book1.title = "autor_0";
        book1.year = 2024;

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.printAllBooks();

       Book found = library.findBookByTitle("cats");


        for (Book b : library.books) {
            if (b.title.equalsIgnoreCase(book.getTitle())) {
                //noinspection DataFlowIssue
                System.out.println("Znaleziono: " + found.title + ", " + found.author);
            }
        }

    }
}
