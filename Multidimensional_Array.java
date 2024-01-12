import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        Syntax for 2-D Array
        // int[][] arr = new int[3][3];
        //         OR
//        int [][] arr = {
//                {1,2,3}, //0th Index
//                {4,5},//1st Index
//                {6,7,8,9} //2nd Index
//        };

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // no. of rows

        //input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        //Output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //     OR
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //       OR
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
