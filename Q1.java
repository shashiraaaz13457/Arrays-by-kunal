import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter the exponent (y): ");
        double y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println(x + " ^ " + y + " = " + result);
    }
}


