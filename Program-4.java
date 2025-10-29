import java.util.*;

public class MultipleCounter {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Use a Map to store results
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Check multiples for numbers 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }

            countMap.put(i, count);
        }

        // Print output in dictionary-like format
        System.out.println(countMap);
    }
}
