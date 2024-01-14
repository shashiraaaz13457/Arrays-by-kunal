import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> List = new ArrayList<>(10); // This doesn't mean it will store only 10 numbers.

//        List.add(67);
//        List.add(76);
//        List.add(76);
//        List.add(76);
//        List.add(88);
//        List.add(76);
//        List.add(76);
//        List.add(76);


//        System.out.println(List.contains(67)); //true.
//        List.set(0,80); // updating the value of Arraylist.
//        List.remove(4);
//        System.out.println(List);  //Printing the list.

        //input
        for (int i = 0; i < 5; i++) {
            List.add(input.nextInt());
        }
        //get item at any index

//        for (int i = 0; i < 5; i++) {
//            System.out.println(List.get(i));
//        }

//        System.out.println(List);
    }
}
