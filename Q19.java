import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        int amount = sc.nextInt();

        int[] notes = { 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCount = new int[8];

        for (int i = 0; i < notes.length; i++) {
            noteCount[i] = amount / notes[i];
            amount %= notes[i];
        }

        System.out.println("Count of notes:");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i] + " rupees: " + noteCount[i]);
        }
    }
}

