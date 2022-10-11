package StudentManagement;

import CourseManagement.CourseInstance;
import UserAuthentication.Person;

import java.util.ArrayList;

public class Student extends Person {
    private String CollegeID;
    private ArrayList <CourseInstance> coursesRegistered;
    private String AdmitSemID;

    public Student(String login, String pwd){
        super(login, pwd);
    }
    public Student(String login, String pwd, String college, String admitsem){
        super(login, pwd);
        this.CollegeID = college;
        this.AdmitSemID = admitsem;
        }

    public ArrayList<CourseInstance> getCoursesRegistered() {
        return coursesRegistered;
    }
    public void registerCourse(CourseInstance ci){
        //Verify the student is eligible to register for the course of CourseInstance ci
        System.out.println("Verification of Student" + this.getName() + " for Registration to the Course " + ci.getCourseName() + " is done!!!");
        this.coursesRegistered.add(ci);
    }
}
