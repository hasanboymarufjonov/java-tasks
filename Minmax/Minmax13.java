package Minmax;

import java.util.Scanner;

public class Minmax13 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, n, maxoddIndex = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number > max && number % 2 == 1) {
                    max = number;
                    maxoddIndex = i;
                }

            }
            if (max == Integer.MAX_VALUE) {
                max = 0;
            }
            System.out.println(maxoddIndex);

        }
    }
}
