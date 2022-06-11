package Minmax;

import java.util.Scanner;

public class Minmax1Method2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }

            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

    }
}
