import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: marks for 5 subjects
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        int sub5 = sc.nextInt();

        // Total and percentage
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / 5.0;

        // Grade logic
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Output results
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}