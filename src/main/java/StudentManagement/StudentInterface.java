package StudentManagement;

import CourseManagement.CourseInstance;
import UserAuthentication.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInterface {
    public StudentInterface(Person s1){
        System.out.println("Welcome to Student Interface, " + s1.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Register for a Course: ");
        System.out.println("2. Course Interface");
        System.out.println("3. Upload Submission");
        System.out.println("4. Exit Application");
        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Select Course for Registration: ");

                break;
            case 2:
                System.out.println("Select Course for Viewing");
                Student st = (Student) s1;
                ArrayList<CourseInstance> regCourses = st.getCoursesRegistered();
                for (int i = 0; i < regCourses.size(); i++)
                    System.out.println("Registered Course " + i + ". regCourses.get(i).getCourseName()");
                break;
            case 3:
                System.out.println("Enter Filename for Submission:");
                String submitFile = mScan.next();
                System.out.println("Uploading Submission " + submitFile);
                break;
            case 4:
                return;
            default:
                break;
            }
        }
    }
