package Minmax;

import java.util.Scanner;

public class Minmax1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min, max, n;

            System.out.print("n = ");
            n = input.nextInt();

            System.out.print("1 = ");
            min = input.nextInt();

            max = min;

            for (int i = 2; i <= n; i++) {
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
