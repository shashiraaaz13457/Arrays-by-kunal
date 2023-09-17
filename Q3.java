import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Time (T): ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate (R): ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;

        System.out.println("Simple Interest = " + SI);
    }
}

