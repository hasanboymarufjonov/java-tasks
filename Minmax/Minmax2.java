package Minmax;

import java.util.Scanner;

public class Minmax2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, n, k = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("a" + i + " = ");
                int a = input.nextInt();
                System.out.print("b" + i + " = ");
                int b = input.nextInt();

                int s = a * b;

                if (s < min) {
                    min = s;
                    k = i;
                }

            }
            System.out.println(k + " - rectangle area is minimal: " + min);

        }

    }
}
