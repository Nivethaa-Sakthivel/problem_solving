import java.util.Scanner;

public class SimpleMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int marks;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            marks = sc.nextInt();
            total = total + marks;
        }

        double percentage = total / 5.0;
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
            grade = "F";
        }

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
