package com.example.inheritance.shapes;

public class InheritanceExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(EColor.ORANGE, 2, 5);
        System.out.println(rectangle);
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());
        System.out.println("Rectangle sufrace = " + rectangle.getSurface());
        System.out.println();

        Square square = new Square(EColor.BLACK, 3);
        System.out.println(square);
        System.out.println("Square perimeter = " + square.getPerimeter());
        System.out.println("Square surface = " + square.getSurface());
        System.out.println();

        Triangle triangle = new Triangle(EColor.BLUE, 3, 4, 5);
        System.out.println(triangle);
        System.out.println("Triangle perimeter = " + triangle.getPerimeter());
        System.out.println("Triangle surface = " + triangle.getSurface());
        System.out.println();

        Circle circle = new Circle(EColor.GREEN, 6);
        System.out.println(circle);
        System.out.println("Circle perimeter = " + circle.getPerimeter());
        System.out.println("Circle surface = " + circle.getSurface());
        System.out.println();


    }
}
