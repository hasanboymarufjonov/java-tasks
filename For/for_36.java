package For;

import java.util.Scanner;

public class for_36 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n, k, sum = 0;

            n = input.nextInt();
            k = input.nextInt();

            for (int i = 0; i < n; i++) {
                int d = 1;
                d++;
                for (int j = 0; j < k; j++) {
                    d *= i;
                }
                sum += d;

            }

            System.out.println(sum);

        }
    }
}