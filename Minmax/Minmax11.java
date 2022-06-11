package Minmax;

import java.util.Scanner;

public class Minmax11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, n, minIndex = 0, maxIndex = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number <= min) {
                    min = number;
                    minIndex = i; // oxirgi uchragan eng kichik
                }

                if (number >= max) {
                    max = number;
                    maxIndex = i; // oxirgi uchragan eng katta
                }

            }

            System.out.println("Last min order is " + minIndex);
            System.out.println("Last max order is " + maxIndex);

            if (maxIndex < minIndex) {
                System.out.println("Last exterimal order is " + minIndex);
            }
            if (maxIndex > minIndex) {
                System.out.println("Last exterimal order is " + maxIndex);
            }
        }
    }
}
