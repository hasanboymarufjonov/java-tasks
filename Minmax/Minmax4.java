package Minmax;

import java.util.Scanner;

public class Minmax4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, n, k = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("n" + i + " = ");
                int n1 = input.nextInt();

                if (n1 < min) {
                    min = n1;
                    k = i;
                }

            }
            System.out.println("Minimal number " + min + " order is " + k);

        }

    }
}
