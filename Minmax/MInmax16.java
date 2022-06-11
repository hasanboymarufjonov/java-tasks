package Minmax;

import java.util.Scanner;

public class MInmax16 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, n, index = 1;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("a" + i + " = ");
                int a = input.nextInt();

                if (a < min) {
                    min = a;
                    index = i;
                }

            }
            System.out.println(index - 1);

        }
    }
}
