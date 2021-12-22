package ru.mirea.task6;
import java.lang.*;

interface Nameable{
    String getName();
}

class Mercury implements Nameable {
    private String name;

    public String getName(){
        System.out.printf("Планета: '%s'\n", name);
        return name;
    }

    Mercury(String name){

        this.name = name;
    }
}


class Venus implements Nameable {
    private String name;

    public String getName(){
        System.out.printf("Планета: '%s'\n", name);
        return name;
    }

    Venus(String name){

        this.name = name;
    }
}


class Earth implements Nameable {
    private String name;

    public String getName(){
        System.out.printf("Планета: '%s'\n", name);
        return name;
    }

    Earth(String name){

        this.name = name;
    }
}




public class Name{
    public static void main(String[] args) {


        Mercury mercury=new Mercury("Mercury");
        Venus venus=new Venus("Venus");
        Earth earth=new Earth("Earth");
        mercury.getName();
        venus.getName();
        earth.getName();

    }}



















