package Minmax;

import java.util.Scanner;

public class Minmax12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, n;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number < min && number > 0) {
                    min = number;
                }

            }
            if (min == Integer.MAX_VALUE) {
                min = 0;
            }
            System.out.println(min);

        }
    }
}
