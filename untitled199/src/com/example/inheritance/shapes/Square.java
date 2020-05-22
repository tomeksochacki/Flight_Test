package com.example.inheritance.shapes;

public class Square extends Rectangle {

    public Square(EColor eColor, double a){
        super(eColor, a, a);
    }

    public void setA(double a){
        setSide(a);
    }

    public void setB(double b){
        setSide(b);
    }

    private void setSide(double side){
        super.setA(side);
        super.setB(side);
    }

    public String toString(){
        return "Square: a= " + a + ", color= " + eColor;
    }
}
