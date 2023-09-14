//import java.util.Scanner;
import java.util.Arrays;
        public class Hello {
            public class TransportationDataAnalysis {
                public static int countNonRepeatedDigits(int N) {
                    if (N < 1 || N > 25000) {
                        System.out.println("Invalid input. Please provide a positive integer within the specifiied range.");
                        return -1; // Return a sentinel value to indicate an error
                    }

                    // Initialize a boolean array to keep track of seen digits
                    boolean[] seenDigits = new boolean[10];

                    // Convert the integer to a string
                    String NStr = Integer.toString(N);

                    // Initialize the count of non-repeated digits
                    int nonRepeatedDigitCount = 0;

                    // Iterate through the characters in the string representation of 'N'
                    for (char digitChar : NStr.toCharArray()) {
                        int digit = digitChar - '0'; // Convert the character to an integer
                        if (!seenDigits[digit]) {
                            seenDigits[digit] = true;
                            nonRepeatedDigitCount++;
                        }
                    }

                    return nonRepeatedDigitCount;
                }

                public static void main(String[] args) {
                    int N1 = 393;
                    int result1 = countNonRepeatedDigits(N1);
                    System.out.println("Sample Input 0: " + N1);
                    System.out.println("Sample Output 0: " + result1);

                    int N2 = 1015;
                    int result2 = countNonRepeatedDigits(N2);
                    System.out.println("Sample Input 1: " + N2);
                    System.out.println("Sample Output 1: " + result2);
                }
            }

        }
