package ru.mirea.task2;

import java.lang.*;
public class Shape {
    private String shape;
    public Shape (String n){
        shape=n;
    }
    public Shape (){
        shape="none";
    }
    public void SetShape(String shape){ this.shape=shape;}
    public String GetShape(){return shape;}
    public String toString(){
        return "Shape is "+this.shape;
    }
}