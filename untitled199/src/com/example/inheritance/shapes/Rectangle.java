package com.example.inheritance.shapes;

public class Rectangle extends AbstractShape{
    double a, b;

    public Rectangle(EColor eColor, double a, double b){
        super(eColor);
        this.a = a;
        this.b = b;
    }
    public double getA(){
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b = b;
    }

    public double getPerimeter(){
        return 2*a + 2*b;
    }

    public double getSurface(){
        return a * b;
    }

    public String toString(){
        return "Rectangle: a= " + a + ", b= " + b + ", color= " + eColor;
    }
}
