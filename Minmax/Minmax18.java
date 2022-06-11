package Minmax;

import java.util.Scanner;

public class Minmax18 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, n, index = 1, index2 = 1;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("a" + i + " = ");
                int a = input.nextInt();

                if (a > max) {
                    max = a;
                    index = i;
                }
                if (a >= max) {
                    index2 = i;
                }

            }
            if (index2 - index == 0) {
                System.out.println(0);
            } else {
                System.out.println(index2 - index - 1);
            }

        }
    }
}
