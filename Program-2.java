import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // Generate series
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            int value = (2 * i) - 1; // Formula for nth odd number
            System.out.print(value);

            // Add comma except after the last number
            if (i < a)
                System.out.print(", ");
        }

        sc.close();
    }
}
