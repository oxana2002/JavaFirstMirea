package ru.mirea.task2;

import java.lang.*;


//книга
class Book{
    private String name; //название книги
    private int pages;
    public Book(String n, int p){
        name=n;
        pages= p;
    }
    public Book( int p){
        name="Book";
        pages= p;

    }
    public Book(){
        name="Book";
        pages= 284;
    }
    public void setName (String name){
        this.name=name;
    }
    public void setPages(int pages) {
        this.pages=pages;
    }
    public  int getPages(int pages){
        return pages;
    }
    public  String getName(String name){
        return name;
    }
    public String toSTRING(){
        return this.name+" , pages "+ this.pages;
    }
    public void yourPage(){
        System.out.println(name+ ": you stopped at the page "+pages/2);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("      ");


        Book book1=new Book("Room",426);
        Book book2=new Book("C++",56);
        Book book3=new Book(734);
        book3.setName("Star");

        System.out.println("book");
        System.out.println(book1);
        book1.yourPage();
        book2.yourPage();
        book3.yourPage();

    }
}