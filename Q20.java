import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = sc.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = sc.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = sc.nextInt();

        boolean isValid = (angle1 + angle2 + angle3 == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0);

        if (isValid) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}

