package Minmax;

import java.util.Scanner;

public class Minmax5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, n, k = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("m" + i + " = ");
                int m = input.nextInt();
                System.out.print("V" + i + " = ");
                int V = input.nextInt();

                int D = m / V;

                if (D > max) {
                    max = D;
                    k = i;
                }

            }
            System.out.println(k + " - density is maximal: " + max);

        }

    }
}
