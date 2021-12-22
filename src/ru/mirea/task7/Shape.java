package ru.mirea.task7;

abstract public class Shape {
    protected String color = "black";
    protected boolean filled = false;

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}