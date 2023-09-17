import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}

