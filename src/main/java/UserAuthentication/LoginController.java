package UserAuthentication;

import FacultyManagement.FacultyMgmtController;
import StudentManagement.StudentInterface;

public class LoginController {
    private Person p1;
    FacultyMgmtController fm;
    StudentInterface si;
    private LoginInterface li;

    public LoginController() {
        this.li = new LoginInterface();
        p1 = li.Login();
        int user = p1.verifyUser();
        switch (user) {
            case 1:
                this.fm = new FacultyMgmtController(this.p1);
                break;
            case 2:
                this.si = new StudentInterface(this.p1);
                break;
            default:
                break;
        }
    }
}
