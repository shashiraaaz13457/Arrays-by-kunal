import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = sc.nextInt();

        int days = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                days = 28; // Assuming a non-leap year
                break;
            default:
                System.out.println("Invalid month number.");
                return;
        }

        System.out.println("Number of days in month " + month + " = " + days);
    }
}
