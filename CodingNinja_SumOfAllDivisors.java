import java.util.Scanner;

public class CodingNinja_SumOfAllDivisors {
    public static void main(String[] args) {
//        //print all divisors


//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n%i == 0){
//                System.out.println(i);
//                if ((n/i)!= i){                // 1 * 36 = 36 here i = 1 and n/i = 36
//                    System.out.println(n/i);   // 2 * 18 = 36 here i = 2 and n/i = 18
//                                               // 3 * 12 = 36 here i = 3 and n/i = 12
//                 }
//            }
//        }

        //Sum of all divisors

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//////                System.out.println(i);
//                sum = sum + j;
//                }
//            }
//        }System.out.println(sum);

        //Optimized code..

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=(n/i)*i;
        }
        System.out.println(sum);
    }
}