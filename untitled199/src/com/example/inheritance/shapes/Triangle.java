package com.example.inheritance.shapes;

public class Triangle extends AbstractShape {
    private double a, b, c;
    public Triangle(EColor eColor, double a, double b, double c){
        super(eColor);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC(){
        return c;
    }

    public void setC(double c){
        this.c = c;
    }

    public double getPerimeter(){
        return a+b+c;
    }

    public double getSurface(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public String toString(){
        return "Triangle: a= " + a + ", b= " + b + ", c= " + c + ", color = " + eColor;
    }
}
