package Week10;

import java.util.ArrayList;

public class Student extends Person{
    private int numCourses;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student() {}

    // public Student() {
    //     this.numCourses = 0;
    // }

    // public Student(int numCourses) {
    //     this();
    // }

    public Student(String name, String address) {
        super(name, address);   //This instruction invokes the constructor of the superclass, which has the same signature
    }

    // public Student(String name, String address, int numCourses) {
    //     this(numCourses);
    //     // super(name, address);
    //     // this.numCourses = numCourses;
    // }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        numCourses++;
        grades.add(grade);
    }

    public void printGrades() {
        System.out.println(grades);
    }

    public double getAverageGrade() {
        int total = 0;

        // for(int i = 0; i < numCourses; i++)
        // for(int i = 0; i < courses.size(); i++)
        for(int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total/grades.size();                 //Getting the average grade
    }

    @Override
    public String toString() {
        return "Student {" + "name = " + name + ", address = " + address + ", number of courses = " + numCourses + ", courses = " + courses + ", grades = " + grades + ", average grade = " + getAverageGrade() + "}";
    }
}
