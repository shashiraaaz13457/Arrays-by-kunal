import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks in Biology: ");
        double biology = sc.nextDouble();
        System.out.print("Enter marks in Mathematics: ");
        double mathematics = sc.nextDouble();
        System.out.print("Enter marks in Computer: ");
        double computer = sc.nextDouble();

        double totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500) * 100;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}