package CourseManagement;

public class Module {
    private String ModuleID;
    private String ModuleName;
    private String SyllabusID;
    private String ModuleType;
    private String contentFile;

    int points;
    char Gradable;

    public Module(String moduleid, String modulename, String syllabusid, String modtype){}

    public void setGradable(char gradable) {
        Gradable = gradable;
        }

    public void setPoints(int points) {
        this.points = points;
        }
    public void setContentFile(String filename){}
}
