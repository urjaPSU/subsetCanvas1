package FacultyManagement;

import UserAuthentication.Person;

public class FacultyMgmtController {
    public FacultyInterface fi;
    public FacultyMgmtController(Person p1){
        this.fi = new FacultyInterface();

    }
}
