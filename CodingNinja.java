import java.util.Scanner;

public class CodingNinja {
    // Count Digit
    public static void main(String[] args) {
        int rem = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = n;
        int count = 0;
        while (num > 0) {

            rem = num % 10;
            if (rem != 0 && n % rem == 0) {
//                System.out.println(rem);
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
