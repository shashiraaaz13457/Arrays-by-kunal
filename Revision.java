import java.util.Arrays;
import java.util.Scanner;

public class Revision {
    //Array..
    // Syntax: datatype[] variable name = new datatype[size];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array of primitives..(int,char,boolean)
//        int[] arr = new int[5];
        //Taking the input in array
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
        //Printing the array


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //      OR
//        for (int num : arr){
//            System.out.println(num + " ");
//        }
        //     OR

//        System.out.println(Arrays.toString(arr)); // Basically it converts it into the string and print it.

        //Array of objects..(String)

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
