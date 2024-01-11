import java.util.Arrays;

public class PassingArrayInFunction {
    public static void main(String[] args) {
        int[] num = {3,4,5,12};
        System.out.println(Arrays.toString(num)); //printing the array
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
