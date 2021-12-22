package ru.mirea.task6;

import java.lang.*;

interface Priceable{
    String getPrice();
}

class Telephone implements Priceable {
    private String prise;

    public String getPrice(){
        System.out.printf("Цена: '%s'\n", prise);
        return prise;
    }

    Telephone(String prise){

        this.prise = prise;
    }
}


class Laptop implements Priceable {
    private String prise;

    public String getPrice(){
        System.out.printf("Цена: '%s'\n", prise);
        return prise;
    }

    Laptop(String prise){

        this.prise = prise;
    }
}


class Tablet implements Priceable {
    private String prise;

    public String getPrice(){
       System.out.printf("Цена: '%s'\n", prise);
        return prise;
    }

    Tablet (String prise){

        this.prise = prise;
    }
}


public class Price{
    public static void main(String[] args) {

        Telephone telephone=new Telephone("33000");
        Laptop laptop=new Laptop("55000");
        Tablet tablet=new Tablet ("18000");
        telephone.getPrice();
        laptop.getPrice();
        tablet.getPrice();
    }}

























