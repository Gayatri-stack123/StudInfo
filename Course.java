package Student;

import java.util.ArrayList;
import java.util.List;
public class Course {
    String courseName;
    int marksObtained;

    // Constructor
    public Course(String courseName, int marksObtained) {
        this.courseName = courseName;
        this.marksObtained = marksObtained;
    }

    // Display course details
    public void displayCourse() {
        System.out.println("Course: " + courseName + " | Marks: " + marksObtained);
    }
}

class Semester {
    int semesterNumber;
    List<Course> courses;

    // Constructor
    public Semester(int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.courses = new ArrayList<>();
    }

    // Add a course to the semester
    public void addCourse(String courseName, int marksObtained) {
        courses.add(new Course(courseName, marksObtained));
    }

    // Display semester details
    public void displaySemester() {
        System.out.println("Semester " + semesterNumber + ":");
        for (Course course : courses) {
            course.displayCourse();
        }
        System.out.println("---------------------------");
    }


    public static void main(String[] args) {
        // Create semesters
        Semester semester1 = new Semester(1);
        semester1.addCourse("Mathematics", 85);
        semester1.addCourse("Physics", 78);
        semester1.addCourse("Chemistry", 80);

        Semester semester2 = new Semester(2);
        semester2.addCourse("Computer Science", 90);
        semester2.addCourse("English", 88);
        semester2.addCourse("Economics", 82);

        // Display semester details
        semester1.displaySemester();
        semester2.displaySemester();
    }
}


