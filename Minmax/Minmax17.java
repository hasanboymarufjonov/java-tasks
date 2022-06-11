package Minmax;

import java.util.Scanner;

public class Minmax17 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, n, index = 1;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("a" + i + " = ");
                int a = input.nextInt();

                if (a > max) {
                    max = a;
                    index = i;
                }

            }
            System.out.println(n - index);

        }
    }
}
