import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        double sqrt = Math.sqrt(number);

        System.out.println("Square root of " + number + " = " + sqrt);
    }
}

