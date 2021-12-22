package ru.mirea.task2;

import java.lang.*;
public class Dog {
    private int age;
    private String name;
    public Dog(int n, String m){
        age=n;
        name=m;
    }
    public Dog(String m){
        age=0;
        name=m;
    }
    public Dog(){
        age=0;
        name="Pup";
    }
    public void SetAge(int age){
        this.age=age;
    }
    public void SetName(String name){
        this.name=name;
    }
    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
    public void Woofing() {
        System.out.println(name + "'s woofing");
    }
}
class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog(2,"Mike");
        Dog d2 = new Dog(7,"Helen");
        Dog d3 = new Dog("Bob");
        d3.SetAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        d2.Woofing();
    }
}