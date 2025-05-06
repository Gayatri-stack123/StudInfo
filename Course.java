public class StudentReport {
    public static void main(String[] args) {
        // Semester 1 courses and marks
        String[] semester1Courses = {"Mathematics", "Physics", "Chemistry"};
        int[] semester1Marks = {85, 78, 80};

        // Semester 2 courses and marks
        String[] semester2Courses = {"Computer Science", "English", "Economics"};
        int[] semester2Marks = {90, 88, 82};

        // Display semester details
        System.out.println("Semester 1:");
        for (int i = 0; i < semester1Courses.length; i++) {
            System.out.println("Course: " + semester1Courses[i] + " | Marks: " + semester1Marks[i]);
        }

        System.out.println("\nSemester 2:");
        for (int i = 0; i < semester2Courses.length; i++) {
            System.out.println("Course: " + semester2Courses[i] + " | Marks: " + semester2Marks[i]);
        }
    }
}
