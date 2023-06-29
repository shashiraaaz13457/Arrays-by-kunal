// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Q. Store a roll no.
        int a = 10;

        //Q. Store a person's name
        String name = "Shashi Raj";

        //Q. Store 5 roll no's
        int rno1 = 23;
        int rno2 = 25;
        int rno3 = 27;
        //It becomes and length and not a appropriate way that's why we use array.

        //syntax
        // datatype[] variable_name = new datatype[size];
        //Store 5 roll no.

        int [] rnos = new int[5];
        //or
        int [] rnos2 = {23,12,34,53,80};

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // intialisation: actually here object is being created in the memory.(heap)

        System.out.println(ros[1]);
        // By default it gives the 0 for int datatype.

        String[] arr = new String[4];
        System.out.println(arr[0]);
        // By default it gives the null for String datatype.

    }
}