package CourseManagement;

import CourseManagement.Course;

public class CourseInstance extends Course {
    private String semester;


    public CourseInstance(String courseid, String coursename, String specid) {
        super(courseid, coursename, specid);
        }
    @Override
    public void createSyllabus(){}
}
