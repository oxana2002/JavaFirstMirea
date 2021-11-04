package ru.mirea.task5.dog;
import java.lang.*;

abstract class Dog{// абстрактный класс
    String breed;//порода
    String name;//имя
    abstract void Play();
}
class Dog1 extends Dog{
    public Dog1(String b, String n){
        breed=b;
        name=n;
    }
    public Dog1(){
        breed="акина-ину";
        name="Хатико";
    }
    public void Test(){
        System.out.println("порода: "+breed);
        System.out.println("имя: "+name);
        System.out.println("");
    }
    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getBreed(String breed){
        return breed;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getMame(String name){
        return name;
    }

    public void Play(){
        System.out.println("Поиграть с собакой - "+name);
        System.out.println("");
    }
}

class Dog2 extends Dog{
    public Dog2(String b, String n){
        breed=b;
        name=n;
    }
    public Dog2(){
        breed="Сенбернар";
        name="Бетховен";
    }
    public void Test(){
        System.out.println("порода: "+breed);
        System.out.println("имя: "+name);
        System.out.println("");
    }
    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getBreed(String breed){
        return breed;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getMame(String name){
        return name;
    }

    public void Play(){
        System.out.println("Поиграть с собакой - "+name);
        System.out.println("");
    }
}

class Dog3 extends Dog{

    public Dog3(String b, String n){
        breed=b;
        name=n;
    }
    public Dog3(){
        breed="чихуахуа ";
        name="Папи";
    }
    public void Test(){
        System.out.println("порода: "+breed);
        System.out.println("имя: "+name);
        System.out.println("");
    }
    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getBreed(String breed){
        return breed;
    }

    public void setName(String name) {
        this.name=name;
    }
    public String getMame(String name){
        return name;
    }

    public void Play(){
        System.out.println("Поиграть с собакой - "+name);
        System.out.println("");
    }
}

 class Main{

    public static void main(String[] args) {
        Dog1 dog1=new Dog1();
        Dog2 dog2=new Dog2();
        Dog3 dog3=new Dog3();
        dog1.Test();
        dog1.Play();
        dog2.Test();
        dog2.Play();
        dog3.Test();
        dog3.Play();

    }
}