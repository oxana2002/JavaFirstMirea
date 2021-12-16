package ru.mirea.task5.Dish;

import java.lang.*;

abstract class Dish{// абстрактный класс
    String colour;//цвет
    double price;//цена
    String types;// вид
    abstract void Discount();
}
class Dish1 extends Dish{
    public Dish1(String c, int p, String t){
        colour=c;
        price=p;
        types=t;
    }
    public void Test(){
        System.out.println("цвет: "+colour);
        System.out.println("цена: "+price);
        System.out.println("вид посуды: "+types);
        System.out.println("");
    }
    public void setColour(String colour) {
        this.colour=colour;
    }
    public String getColour(String colour){
        return colour;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public  int getPrice(int price){
        return price;
    }

    public void setTypes(String types) {
        this.colour=colour;
    }
    public String getTypes(String types){
        return colour;
    }

    public Dish1(){
        colour="белый";
        price=199;
        types="тарклка";
    }
    public void Discount(){
        System.out.println("Снизим цену на 50%. Было "+price+" стало "+price/2);
        System.out.println("");
    }
}

class Dish2 extends Dish{
    public Dish2(String c, int p, String t){
        colour=c;
        price=p;
        types=t;
    }
    public Dish2(){
        colour="зелёный";
        price=99;
        types="блюдце";
    }
    public void Test(){
        System.out.println("цвет: "+colour);
        System.out.println("цена: "+price);
        System.out.println("вид посуды: "+types);
        System.out.println("");
    }
    public void setColour(String colour) {
        this.colour=colour;
    }
    public String getColour(String colour){
        return colour;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public  int getPrice(int price){
        return price;
    }

    public void setTypes(String types) {
        this.colour=colour;
    }
    public String getTypes(String types){
        return colour;
    }

    public void Discount(){
        System.out.println("Снизим цену на 50%. Было "+price+" стало "+price/2);
        System.out.println("");
    }
}

class Dish3 extends Dish{
    public Dish3(String c, int p, String t){
        colour=c;
        price=p;
        types=t;
    }
    public Dish3(){
        colour="красный";
        price=250;
        types="миска";
    }
    public void Test(){
        System.out.println("цвет: "+colour);
        System.out.println("цена: "+price);
        System.out.println("вид посуды: "+types);
        System.out.println("");
    }
    public void setColour(String colour) {
        this.colour=colour;
    }
    public String getColour(String colour){
        return colour;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public  int getPrice(int price){
        return price;
    }

    public void setTypes(String types) {
        this.colour=colour;
    }
    public String getTypes(String types){
        return colour;
    }
    public void Discount(){
        System.out.println("Снизим цену на 50%. Было "+price+" стало "+price/2);
        System.out.println("");
    }
}

public class Main{

    public static void main(String[] args) {
        Dish1 dish1=new Dish1();
        Dish2 dish2=new Dish2();
        Dish3 dish3=new Dish3();
        dish1.Test();
        dish1.Discount();
        dish2.Test();
        dish2.Discount();
        dish3.Test();
        dish3.Discount();
    }
}













