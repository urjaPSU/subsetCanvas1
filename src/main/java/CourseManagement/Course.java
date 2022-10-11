package CourseManagement;

public class Course {
    private String CourseID;
    private String CourseName;
    private String SpecialisationID;

    public Course(String courseid, String coursename, String specid ){
        this.CourseID = courseid;
        this.CourseName = coursename;
        this.SpecialisationID = specid;
        }
    public void createSyllabus(){}
    public String getCourseName()  {
        return this.CourseName;
        }
    }
