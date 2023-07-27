
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner circle = new Scanner(System.in);
    public static void main(String[] args){
        //Question1
        Person person1 = new Person("Florence", 22);  //created Person objects
        Person person2 = new Person("Miff",23);

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);

        //Question2
        Dog dog1 = new Dog("simba","GermanSheperd");
        Dog dog2 = new Dog("rex","Bulldog");

        System.out.println(dog1.getName());
        dog1.setName("Dexta");
        System.out.println("updated dog name is: " + dog1.getName());

        //Question3
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,1);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

        //Question4
        System.out.print("Enter the radius: ");
        /*storing the entered radius in double
         * because a user can enter radius in decimals
         */
        double radius = circle.nextDouble();
        //Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //Circumference = 2*PI*radius
        double circumference= Math.PI * 2*radius;
        System.out.println( "The circumference of the circle is:"+circumference) ;

        //Question6
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
        System.out.println("\nEmployee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.raiseSalary(8);
        employee2.raiseSalary(12);

        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for 'Franziska Waltraud':");
        employee1.printEmployeeDetails();
        System.out.println("\n12% for 'Hubertus Andrea':");
        employee2.printEmployeeDetails();
        //Question8

        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());
        System.out.println("After changing color");
        light.setColor("green");

        System.out.println("The light is now green: " + light.isGreen());
        System.out.println("The light duration is: " + light.getDuration());
        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());


    }
}



