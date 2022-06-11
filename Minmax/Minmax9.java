package Minmax;

import java.util.Scanner;

public class Minmax9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, n, maxIndex = 0, maxIndex2 = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number > max) {
                    max = number;
                    maxIndex = i; // birinchi uchragan eng katta
                }

                if (number >= max) {
                    maxIndex2 = i; // oxirgi uchragan eng katta
                }

            }

            System.out.println("First max order is " + maxIndex);
            System.out.println("Last max order is " + maxIndex2);
        }
    }
}
