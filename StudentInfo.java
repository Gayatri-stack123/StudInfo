

import java.util.Calendar;

public class StudentInfo {
    public static void main(String[] args) {
        // Student details
        String name = "John Doe"; // Replace with actual student name
        int birthYear = 2000, birthMonth = 5, birthDay = 6; // Replace with actual date of birth

        // Get current date
        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH) + 1; // Months start from 0
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        // Calculate age
        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--; // Adjust if birthday hasn't occurred yet this year
        }

        // Display student details
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age + " years");
    }

}
