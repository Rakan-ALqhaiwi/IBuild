package com.mycompany.geometricobject;

import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = in.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = in.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = in.nextDouble();

        System.out.print("Enter color: ");
        String color = in.next();
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = in.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\n--- Triangle Info ---");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

    }
}
