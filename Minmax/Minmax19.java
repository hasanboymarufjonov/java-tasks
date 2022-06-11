package Minmax;

import java.util.Scanner;

public class Minmax19 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, n, count = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("a" + i + " = ");
                int a = input.nextInt();

                if (a < min) {
                    min = a;
                }
                if (a >= min) {
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
