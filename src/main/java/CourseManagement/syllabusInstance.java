package CourseManagement;

import CourseManagement.Course;

public class syllabusInstance extends syllabusMaster {
    private String syllabusInstanceID;
    private String courseInstanceID;

    public syllabusInstance(String syllabid, Course cou) {
        super(syllabid, cou);
    }

    @Override
    public void updateSyllabus(){}
}
