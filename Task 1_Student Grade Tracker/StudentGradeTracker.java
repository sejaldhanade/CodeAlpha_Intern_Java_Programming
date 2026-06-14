import java.util.*;

public class StudentGradeTracker {

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE TRACKER =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 0; i < n; i++) {
            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name\t\tMarks\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t\t" + marks[i] + "\t" + calculateGrade(marks[i]));
        }

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
