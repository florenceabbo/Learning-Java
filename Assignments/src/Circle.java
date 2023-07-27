//public class Circle {
//    private double radius;
//
//    public Circle(double radius){
//        this.radius = radius;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//    public double getArea(){
//        return Math.PI*(radius*radius);
//    }
//    public double getCircumference(){
//        return 2*(Math.PI*radius);
//
//    }
//
//    public static void main(String[] args) {
//        Circle circle1 = new Circle(30);
//        System.out.println(circle1.getArea());
//        System.out.println(circle1.getCircumference());
//    }
//
//}
//Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute.
//Calculate the area and circumference of the circle.

import java.util.Scanner;  //java.util is a java package
public class Circle   //created class circle
{
    static Scanner circle = new Scanner(System.in);  //Created an object of the scanner class
    //Scanner is a class in java.util used to take inputs from a user.

    public static void main(String args[])
    {
        System.out.print("Enter the radius: ");
//  storing the entered radius in double
//  because a user can enter radius in decimals

        double radius = circle.nextDouble();
        //Area = PI*radius*radius

        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);

        //Circumference = 2*PI*radius
        double circumference= Math.PI * 2*radius;
        System.out.println( "The circumference of the circle is:"+circumference) ;
    }
}
