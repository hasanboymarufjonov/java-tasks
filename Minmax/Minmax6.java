package Minmax;

import java.util.Scanner;

public class Minmax6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n, minIndex = 0, maxIndex = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number < min) {
                    min = number;
                    minIndex = i; // birinchi uchragan uchragan eng kichik
                }

                if (number >= max) {
                    max = number;
                    maxIndex = i; // oxirgi uchragan eng katta
                }

            }

            System.out.println("First min order is " + minIndex);
            System.out.println("Last max order is " + maxIndex);
        }
    }
}
