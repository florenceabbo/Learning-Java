import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private int student_id;
    private String student_name;
    private List<Double> grades;

    public Student1(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please provide a grade between 0 and 100.");
        }
    }

//    public static void main(String[] args) {
//        Student1 student = new Student(12345, "John Doe");
//        student.addGrade(85.5);
//        student.addGrade(90.0);
//        student.addGrade(105.0); // Invalid grade
//        student.addGrade(-10.0); // Invalid grade
//
//        System.out.println("Student ID: " + student.getStudentId());
//        System.out.println("Student Name: " + student.getStudentName());
//        System.out.println("Grades: " + student.grades);
//    }
}
