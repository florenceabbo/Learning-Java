//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
//and methods to calculate and update salary.
public class Employee {
    //Created class Employee
    private String name;

    // Used the private identifier coz we are using the getters and setters methods
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        // Created a constructor to initialise attributes of the class
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        //Used getter method to get initial values of the attributes from the constructor
        return name;
    }

    public void setName(String name) {
        //Used setter method to update values of the attribute
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
// Created instances of employees

        Employee employee1 = new Employee("Doreen Captain", " Manager", 20000);
        Employee employee2 = new Employee("Abbo Flo", "Software Engineer", 30000);
        System.out.println("\nEmployee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
//Created salary percentage raise instances
        employee1.raiseSalary(25);
        employee2.raiseSalary(12);

        System.out.println("\nAfter raising salary:");
        System.out.println("\n25% for 'Dorren Captain':");
        employee1.printEmployeeDetails();
        System.out.println("\n12% for 'Abbo Flo':");
        employee2.printEmployeeDetails();
    }
}
