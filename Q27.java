import java.util.Scanner;
public class Q27
{
    public static void main(String[] args)
    {
        int r, n, num,
                mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            mul = mul * r;
            num = num / 10;
        }
        System.out.println("Multiply of digit=" + mul);
    }
}
