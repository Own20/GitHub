import java.util.ArrayList;

package Week10;

public class Teacher extends Person{
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher() {}

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if(courses.get(course) == courses.equals(course)) {
            return false;
        }
        else {
            courses.add(course);
            return true;
        }

        // boolean courseExist = courses.contains(course);
        // if(!courseExist){
        //     courses.add(course);
        //     numCourses++;
        //     return true;
        // }
        // return false;
    }

    public boolean removeCourse(String course) {
        if(courses.get(course) != courses.equals(course)) {
            return false;
        }
        else {
            courses.remove(course);
            return true;
        }

        // boolean courseExist = courses.contains(course);
        // if(courseExist){
        //     courses.remove(course);
        //     numCourses--;
        //     return true;
        // }
        // return false;
    }

    @Override
    public String toString() {
        return "Teacher {" + "name = " + name + ", address = " + address + ", number of courses = " + numCourses + ", courses = " + courses + "}";
    }
}
