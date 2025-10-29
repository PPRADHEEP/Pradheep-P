import java.util.Scanner;

public class OddSeriesPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();

        // If input is even, reduce it by 1
        if (a % 2 == 0) {
            a = a - 1;
        }

        System.out.print("Output: ");
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);

            // Add comma except after the last number
            if (i + 2 <= a)
                System.out.print(", ");
        }

        sc.close();
    }
}
