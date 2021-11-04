package ru.mirea.task5;
import java.lang.*;

abstract class Furniture{// абстрактный класс
    String material;//материал
    double price;//цена
    String type;
}


class Furniture1 extends Furniture{
    public Furniture1(String m, int p, String t){
        material=m;
        price=p;
        type=t;
    }
    public Furniture1(){
        material="кожа";
        price=6999;
        type="кресло";
    }

    public void setMaterial(String material) {
        this.material=material;
    }
    public String getMaterial(String material){
        return material;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public int getPrice(int price){
        return price;
    }

    public void setType(String type) {
        this.type=type;
    }
    public String getType(String type){
        return type;
    }
    public void Test(){
        System.out.println("материал: "+material);
        System.out.println("цена: "+price);
        System.out.println("название мебели: "+type);
    }

}

class Furniture2 extends Furniture{
    public Furniture2(String m, int p, String t){
        material=m;
        price=p;
        type=t;
    }
    public Furniture2(){
        material="берёза";
        price=15999;
        type="шкаф";
    }

    public void setMaterial(String material) {
        this.material=material;
    }
    public String getMaterial(String material){
        return material;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public int getPrice(int price){
        return price;
    }

    public void setType(String type) {
        this.type=type;
    }
    public String getType(String type){
        return type;
    }
    public void Test(){
        System.out.println("материал: "+material);
        System.out.println("цена: "+price);
        System.out.println("название мебели: "+type);
    }
}

class Furniture3 extends Furniture{

    public Furniture3(String m, int p, String t){
        material=m;
        price=p;
        type=t;
    }
    public Furniture3(){
        material="экокожа";
        price=68999;
        type="диван";
    }

    public void setMaterial(String material) {
        this.material=material;
    }
    public String getMaterial(String material){
        return material;
    }

    public void setPrice(int price) {
        this.price=price;
    }
    public int getPrice(int price){
        return price;
    }

    public void setType(String type) {
        this.type=type;
    }
    public String getType(String type){
        return type;
    }
    public void Test(){
        System.out.println("материал: "+material);
        System.out.println("цена: "+price);
        System.out.println("название мебели: "+type);
    }
}

class FurnitureShop{
    String department;
    String name;
    int floor;

    public FurnitureShop(String d, String n, int f){
        department=d;
        name=n;
        floor=f;
    }
    public FurnitureShop(){
        department="диваны";
        name="IKEA";
        floor=3;
    }

    public void setDepartment(String department) {
        this.department=department;
    }
    public String getDepartment(String department){
        return department;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getName(String name){
        return name;
    }

    public void setFloor(int floor) {
        this.floor=floor;
    }
    public int getFloor(int floor){
        return floor;
    }
    public void Test(){
        System.out.println("название отдела: "+department);
        System.out.println("название: "+name);
        System.out.println("всего этажей: "+floor);
    }
}
public class Main{

    public static void main(String[] args) {
        Furniture1  furniture1=new  Furniture1();
        Furniture2  furniture2=new  Furniture2();
        Furniture3  furniture3=new  Furniture3();
        FurnitureShop furnitureShop=new FurnitureShop();
        furniture1.Test();
        System.out.println("");
        furniture2.Test();
        System.out.println("");
        furniture3.Test();
        System.out.println("");
        furnitureShop.Test();
    }
}














