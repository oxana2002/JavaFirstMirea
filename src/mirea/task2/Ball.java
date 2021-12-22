package mirea.task2;
import java.lang.*;
public class Ball {
    private String size;
    private String colour;
    public Ball(String n, String m){
        size=n;
        colour=m;
    }
    public Ball(String n){
        size=n;
        colour="none";
    }
    public Ball(){
        size="none";
        colour="none";
    }
    public void SetSize(String size){
        this.size=size;
    }
    public void SetColour(String colour){
        this.colour=colour;
    }
    public String GetSize(){
        return size;
    }
    public String GetColour(){
        return colour;
    }
    public void store_report(){
        System.out.println("Ball is "+size+" and "+colour+" colour");
    }
    public void burst(){
        System.out.println(colour+"'s ball is burst");
    }
}
class TestBall {
    public static void main(String[] args){
        Ball d1 = new Ball("small","red");
        Ball d2 = new Ball();
        Ball d3 = new Ball("big");
        d3.SetColour("blue");
        d1.burst();
    }
}