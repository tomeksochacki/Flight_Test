package com.example.inheritance.shapes;

public class PolymorphismExample {
    public static void main(String[] args) {

        AbstractShape shape1 = new Rectangle(EColor.GREEN, 2, 4);
        AbstractShape shape2 = new Square(EColor.BLUE, 3);
        AbstractShape shape3 = new Triangle(EColor.ORANGE, 3, 5, 6);
        AbstractShape shape4 = new Circle(EColor.WHITE, 4);

        AbstractShape[] shape = {shape1, shape2, shape3, shape4};

        for (AbstractShape shapes : shape) {
            System.out.println(shapes);
            System.out.println("Perimeter = " + shapes.getPerimeter());
            System.out.println("Surface = " + shapes.getSurface());
            System.out.println();
        }

        shape1 = new Circle(EColor.YELLOW, 3);
        System.out.println(shape1);

    }
}
