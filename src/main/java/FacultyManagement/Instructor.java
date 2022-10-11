package FacultyManagement;

import CourseManagement.Module;
import FacultyManagement.Faculty;

public class Instructor extends Faculty {
    String courseInstanceID;

    public Instructor(String login, String pwd) {
        super(login, pwd);
        }
    public void evaluateStudentSubmissions(Module module){}
    public void calcFinalGrade(){}
    public void uploadResultFinalPath(){}
}
