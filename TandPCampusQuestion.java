import java.util.Scanner;

public class TandPCampusQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = input.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = input.nextInt();
        System.out.println("Enter the number3: ");
        int num3 = input.nextInt();
        int output = 0;
        int max = 0;
        for (int i = 0; i < 3; i++)
            {
                int rem1 = num1 % 10;
                int rem2 = num2 % 10;
                int rem3 = num3 % 10;

                int res = (rem1 > rem2 && rem3 > rem2) ? rem2 : (rem1 > rem3)? rem3 : rem1;

                if (i == 0){
                    res = res * 1;
                    output = output+res;
                } if (i == 1) {
//                    System.out.println();
                    res = res * 10;
                    output = output+res;
                }
                if(i == 2){
                    res = res * 100;
                    output = output+res;
                }
                if (i == 2){
                    max = (rem1 > rem2 && rem1 > rem3) ? rem1 : (rem2 > rem3) ? rem2 : rem3;

                }

                // You can't solve by this because where you store the value after each iteration.

//                if (rem1 > rem2)
//                {
//                    if (rem3 > rem2)
//                    {
//                        System.out.println(rem2);
//                    }
//                    else {
//                        System.out.println(rem3);
//                    }
//
//                }
//                else {
//                    if (rem1 > rem3){
//                        System.out.println(rem3);
//                    }
//                    else {
//                        System.out.println(rem1);
//                    }
//                }
//                if (i == 2){
//                    if (rem1 > rem2)
//                    {
//                        if (rem1 > rem3)
//                        {
//                            System.out.println(rem1);
//                        }
//                        else{
//                            System.out.println(rem3);
//                        }
//
//                    }
//                    else{
//                        if (rem2 > rem3)
//                        {
//                            System.out.println(rem2);
//                        }
//                        else
//                            System.out.println(rem3);
//                    }
//                }



                num1= num1/10;
                num2= num2/10;
                num3= num3/10;

            }
        System.out.println(max*1000+output);



//        int output = num1 * 100 + num2 * 10 + num3 ;
//        System.out.println("output: " + output);

            }

    }

