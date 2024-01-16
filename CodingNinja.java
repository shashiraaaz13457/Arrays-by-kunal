import java.util.Scanner;

public class CodingNinja {
    // 1.Count Digit
//    public static void main(String[] args) {
//        int rem = 0;
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int num = n;
//        int count = 0;
//        while (num > 0) {
//
//            rem = num % 10;
//            if (rem != 0 && n % rem == 0) {
////                System.out.println(rem);
//                count++;
//            }
//            num = num / 10;
//        }
//        System.out.println(count);
//    }
    //2. Armstrong Number
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int temp = n;
//        int sum = 0;
//        int rem ;
//        while (n > 0){
//           rem = n%10 ;
//           int cube = rem*rem*rem;
//           sum = sum + cube;
//           n = n/10;
//        }
//        if (temp == sum){
////            return true;
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
//    }
        static boolean boolcheck(int n){
            int temp = n;
            double sum = 0;
            int rem ;
            int count = 0;
            while(temp>0){
                temp = temp/10;
                count++;
            }
            temp = n;
            while (n > 0){
                rem = n%10 ;
                double k = Math.pow(rem, count);
                sum = sum + k;
                n = n/10;
            }
            return temp == sum;
        }

        public static void main(String[] args) {
            // Write your code here

            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            boolean result = boolcheck(n);
            System.out.println(boolcheck(n));
        }
    }

