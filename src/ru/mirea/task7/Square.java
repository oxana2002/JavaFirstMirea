package ru.mirea.task7;

public class Square extends Rectangle{
    public Square(){
        width = length = 1;
    }

    public Square(double side){
        width = length = side;
    }

    public Square(double side, String color, boolean filled){
        width = length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side){
        width = length = side;
    }

    @Override
    public void setWidth(double side){
        width = length = side;
    }

    @Override
    public void setLength(double side){
        width = length = side;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}