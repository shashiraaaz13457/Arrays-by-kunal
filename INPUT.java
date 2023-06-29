import java.util.Arrays;
import java.util.Scanner;

public class INPUT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();

        // array of primitives.
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 46;
//        arr[2] = 465;
//        arr[3] = 426;
//        arr[4] = 416;
        //internally {23,46,465,426,416}
//        System.out.println(arr[3]);
        
        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        System.out.println(arr[3]);

        // Printing the array from normal for loop method.
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // Printing the array from for-each method.
//        for (int num : arr) { // for every element in array, print the element.
//            System.out.println(num + " "); // here num represents element of array.
//        }

        // Printing the array using toString() method.(easy one)

//        System.out.println(Arrays.toString(arr));

        // array of objects/Non-primitives.
        String[] stri = new String[4];
        for (int i = 0; i < stri.length; i++) {
            stri[i] = input.next();
        }

        System.out.println(Arrays.toString(stri));

        //modify (Changing the original object)
        stri[1] = "Shashi";

        System.out.println(Arrays.toString(stri));
    }
}
