//Question1.
//Write a java program to create a class called Student with private instance
//variables student_id, student_name, and grades. Provide public getter and setter methods to
//access and modify the student student_id and student_name variables.
//However, provide a method called addGrade() that allows adding a grade to the grades
// variables while performing additional validation.



import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private ArrayList< Integer > grades;


    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grades = new ArrayList < Integer > ();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(Integer grade) {
        grades.add(grade);
    }
    public void printStudentDetails() {
        System.out.println("Student's Name: " + studentName);
    }
    public static void main(String[] args) {
        Student student1 = new Student(1, "Abbo Fulumera");
        Student student2 = new Student(2, "Adee Joyce");
        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();

        System.out.println("Adding grades for " + student1.getStudentName());
        student1.addGrade(90);
        student1.addGrade(78);
        student1.addGrade(88);
        System.out.println(student1.getStudentName() + "'s grades: " + student1.getGrades());

        System.out.println("Adding grades for " + student2.getStudentName());
        student2.addGrade(78);
        student2.addGrade(88);
        student2.addGrade(76);
        System.out.println(student2.getStudentName() + "'s grades: " + student2.getGrades());
    }

}

