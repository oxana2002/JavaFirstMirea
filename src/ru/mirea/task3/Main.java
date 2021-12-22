package ru.mirea.task3;

import java.util.Scanner;

import java.lang.*;

//книга
class Book{
    private String name; //название книги
    private int pages; // кол-во страниц
    private String author; // имя автора
    private int year;// год написания

    public Book(String n, int p, String a, int y){
        name=n;
        pages= p;
        author=a;
        year=y;
    }
    public Book( int p){
        name="Book";
        pages= p;
        author="Mark Twain";
        year=1876;
    }
    public Book(){
        name="Book";
        pages= 284;
        author="Mark Twain";
        year=1876;

    }
    public void setName (String name){
        this.name=name;
    }
    public void setPages(int pages) {
        this.pages=pages;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public  int getPages(int pages){
        return pages;
    }
    public  String getName(String name){
        return name;
    }
    public  String getAuthor(String author){
        return author;
    }
    public  int getYear(int year){
        return year;
    }
    public String toSTRING(){
        return this.name+" , pages "+ this.pages;
    }
    public void yourPage(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Названте книги: "+name);
        System.out.println("Колличество стрвниц: "+pages);
        System.out.println("Имя автора: "+author);
        System.out.println("Год выхода на свет: "+year);
        System.out.println("");
    }


}

class TestBook{

    public static void main(String[] args) {
        Book book1=new Book();
        book1.yourPage();
        Book book=new Book(){

            @Override public void yourPage () {
                String name = "The prophet"; //название книги
                int pages = 43; // кол-во страниц
                String author = "Alexander Sergeyevich Pushkin"; // имя автора
                int year = 1828;// год написания
                System.out.println("Названте книги: " + name);
                System.out.println("Колличество стрвниц: " + pages);
                System.out.println("Имя автора: " + author);
                System.out.println("Год выхода на свет: " + year);
            }
        };
        book.yourPage();
    }

}














