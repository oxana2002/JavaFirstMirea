package ru.mirea.task3;

public class Circle{
    private double radius = 2;
    private String color = "красный";
    private float PI= (float) 3.14;

    public Circle(){} //конструктор
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Окружность{" + "радиус=" + radius + ", цвет='" + color + '\'' +'}';
    }
}

class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(4, " зелёный");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());
    }
}
