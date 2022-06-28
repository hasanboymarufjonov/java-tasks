package For;

import java.util.Scanner;

public class for_38 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n, sum = 0;

            n = input.nextInt();

            for (int i = 0; i < n; i++) {
                int d = 1;
                d++;
                for (int j = 1; j < n - i; j++) {
                    d *= i;
                }
                sum += d;

            }

            System.out.println(sum);

        }
    }
}