package Week10;

public class Driver {
    public static void main(String[] args) {
        Person p = new Person("Anya", "Bintaro");
        System.out.println(p.toString());

        Student s1 = new Student();
        s1.setAddress("BSD");
        System.out.println(s1.toString());

        Student s2 = new Person("Arvin", "BSQ");
        System.out.println(s2.toString());

        s2.addCourseGrade("OOP", 90);
        s2.addCourseGrade("DS", 0);
        s2.addCourseGrade("Linear", 70);
        s2.printGrades();
        System.out.println(s2.getAverageGrade());

        Teacher t1 = new Teacher();
        t1.addCourse("OOP");
        t1.addCourse("DS");
        t1.addCourse("Linear");
        t1.removeCourse("Linear");
        System.out.println(t1.toString());
    }
}
