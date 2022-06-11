package Minmax;

import java.util.Scanner;

public class Minmax3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, n, k = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("a" + i + " = ");
                int a = input.nextInt();
                System.out.print("b" + i + " = ");
                int b = input.nextInt();

                int p = 2 * (a + b);

                if (p > max) {
                    max = p;
                    k = i;
                }

            }
            System.out.println(k + " - rectangle perimeter is maximal: " + max);

        }

    }
}
