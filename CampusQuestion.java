import java.util.Scanner;
public class CampusQuestion {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter three numbers:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();

                int ones1 = num1 % 10;
                int tens1 = (num1 / 10) % 10;
                int hundreds1 = (num1 / 100) % 10;

                int ones2 = num2 % 10;
                int tens2 = (num2 / 10) % 10;
                int hundreds2 = (num2 / 100) % 10;

                int ones3 = num3 % 10;
                int tens3 = (num3 / 10) % 10;
                int hundreds3 = (num3 / 100) % 10;


                int minOnes = Math.min(Math.min(ones1, ones2), ones3);
                int minTens = Math.min(Math.min(tens1, tens2), tens3);
                int minHundreds = Math.min(Math.min(hundreds1, hundreds2), hundreds3);
                int maxHundreds = Math.max(Math.max(hundreds1, hundreds2), hundreds3);


                int output = maxHundreds * 1000 + minHundreds * 100 + minTens * 10 + minOnes;

                System.out.println("Output number: " + output);
            }
        }

