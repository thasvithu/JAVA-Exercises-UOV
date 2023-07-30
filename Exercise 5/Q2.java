/*
2) To create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create sub classes Circle and Triangle that extends the Shape class and implements the respective methods to calculate the area and Perimeter of each Shape.
*/

import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        sc.close();

        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle is: " + perimeter);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
        sc.close();

        double area = 0.5 * base * height;
        System.out.println("Area of triangle is: " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        side1 = sc.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        side2 = sc.nextDouble();
        sc.close();

        double perimeter = base + side1 + side2;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.calculateArea();
        circle.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
