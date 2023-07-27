//Write a Java program to create a class called "Student" with a name, grade, and
//courses attributes, and methods to add and remove courses.
import java.util.ArrayList;
import java.util.List;
public class Students {
    //Importing packages so that we can access the required java
// classes of ArrayList and List


    //Create a Student class and define it as a public class, which means
// it can be accessed from other classes.

        //Defining instance variables
        //These variables store the name, grade, and a list of courses for a student.
        private String name;
        private int grade;
        private List<String> courses;

        //Creating a constructor to initialise parameters name, grade, and the courses as an empty list
        public Students(String name, int grade) {
            this.name = name;
            this.grade = grade;
            this.courses = new ArrayList<>();
        }

        // Getter and Setter for the name attribute
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for the grade attribute
        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        // Getter and Setter for the courses attribute
        public List<String> getCourses() {
            return courses;
        }

        public void setCourses(List<String> courses) {
            this.courses = courses;
        }

        // Method to add a course
        public void addCourse(String course) {
            courses.add(course);
        }

        // Method to remove a course
        public void removeCourse(String course) {
            courses.remove(course);
        }

        //We create the main method which serves as the entry point for the program.
        //It creates a new Student object, sets its name and grade, adds some courses, removes a course.
        public static void main(String[] args) {
            Student student = new Student("Joyce Tina", 10);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Grade: " + student.getGrade());

            student.addCourse("Math");
            student.addCourse("Science");
            student.addCourse("English");

            System.out.println("Courses: " + student.getCourses());

            student.removeCourse("Science");
            student.addCourse("SST");

            System.out.println("Updated Courses: " + student.getCourses());
        }
    }



