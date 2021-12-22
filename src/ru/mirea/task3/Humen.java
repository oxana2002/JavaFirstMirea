package ru.mirea.task3;


import  java.util.Scanner;
import java.lang.*;

class Head{
    boolean moles;
    boolean hair;
    public Head( boolean m, boolean h ){
        moles= m;
        hair=h;
    }
    public Head( ){
        moles= false;
        hair=true;
    }
    public void setMoles ( boolean moles){
        this.moles=moles;
    }
    public void setHair(boolean hair) {
        this.hair=hair;
    }
    public boolean getMoles (boolean moles){
        return moles;
    }
    public boolean getHair (boolean hair){
        return hair;
    }
    public String toSTRING(){
        return this.moles+" , hair "+ this.hair;
    }
    public void turningHead() {
        Scanner sc=new Scanner(System.in);
        String side=sc.nextLine();
        if(side.equals("w")){
            System.out.println("Поднять голову");
        }
        if(side.equals("d")){
            System.out.println("Повернуть голову вправо");
        }
        if(side.equals("s")){
            System.out.println("отпустить голову");
        }
        if(side.equals("a")){
            System.out.println("Повернуть голову влево");
        }
    }
}

class Leg {
    private double strength;
    private double speed;

    public Leg(float s, float sp) {
        strength = s;
        speed = sp;
    }

    public Leg() {
        strength = 53.7;
        speed = 43.1;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getsStrength(double strength) {
        return strength;
    }

    public double getSpeed(double speed) {
        return speed;
    }

    public String toSTRING() {
        return this.speed + " , strength " + this.strength;
    }

    public void turningLeg() {
        Scanner sc = new Scanner(System.in);
        String side = sc.nextLine();
        if (side.equals("w")) {
            System.out.println("Подняться");
        }
        if (side.equals("d")) {
            System.out.println("Пойти на право");
        }
        if (side.equals ("s")) {
            System.out.println("Спуститься");
        }
        if (side.equals("a")) {
            System.out.println("Пойти на лево");
        }

    }
}

class Hand {
    private double strength;
    private boolean scar;

    public Hand(float s, boolean sc) {
        strength = s;
        scar = sc;
    }

    public Hand() {
        strength = 53.7;
        scar = false;
    }

    public Hand(double s, boolean sc) {
        strength = s;
        scar = sc;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setScar(boolean scar) {
        this.scar = scar;
    }

    public double getsStrength(double strength) {
        return strength;
    }

    public boolean getScar(boolean scar) {
        return scar;
    }

    public String toSTRING() {
        return this.scar + " , strength " + this.strength;
    }

    public void handStrike() {
        Scanner sc = new Scanner(System.in);
        String side = sc.nextLine();
        if (side.equals("q")) {
            System.out.println("Ударить правой рукой");
        }
        if (side.equals("e")) {
            System.out.println("Ударить левой рукой");
        }

    }
}


class Human {
    //                public Human(){}
    public void do_something() {
        Head head1 = new Head();
        Leg leg1 = new Leg();
        Hand hand1 = new Hand();
        head1.turningHead();
        leg1.turningLeg();
        hand1.handStrike();
    }
}





public class Humen {

    public static void main(String[] args) {
        Human human =new Human();
        human.do_something();
    }
}