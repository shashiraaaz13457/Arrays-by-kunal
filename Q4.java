import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Time (T) in years: ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate (R) in percentage: ");
        double R = sc.nextDouble();

        System.out.print("Enter compounding frequency (e.g. 12 for monthly): ");
        int n = sc.nextInt();

        double r = R / 100;

        double CI = P * Math.pow(1 + (r / n), n * T) - P;

        System.out.println("Compound Interest = " + CI);
    }
}
