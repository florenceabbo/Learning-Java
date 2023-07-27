
//Write a Java program to create a class called "Shape" with abstract methods for
//calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
public class ShapeWithAbstractMethods {
    abstract class Shape {
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Triangle extends Shape {
        private double side1;
        private double side2;
        private double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        double calculateArea() {
            // Using Heron's formula
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    }

//    public class Main {
//        public static void main(String[] args) {
//            Rectangle rectangle = new Rectangle(5, 7);
//            Circle circle = new Circle(3);
//            Triangle triangle = new Triangle(3, 4, 5);
//
//            System.out.println("Rectangle: ");
//            System.out.println("Area: " + rectangle.calculateArea());
//            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
//
//            System.out.println("\nCircle: ");
//            System.out.println("Area: " + circle.calculateArea());
//            System.out.println("Perimeter: " + circle.calculatePerimeter());
//
//            System.out.println("\nTriangle: ");
//            System.out.println("Area: " + triangle.calculateArea());
//            System.out.println("Perimeter: " + triangle.calculatePerimeter());
//        }
    }


