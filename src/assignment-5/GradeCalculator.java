import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = in.nextInt();

        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);

        in.close(); 
    }
    

    public static String calculateGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else if (marks <= 40) {
            return "Fail";
        } else {
            return "Marks must be between 0 and 100";
        }
    }
}