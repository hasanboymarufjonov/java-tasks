package Minmax;

import java.util.Scanner;

public class Minmax8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = Integer.MAX_VALUE, n, minIndex = 0, minIndex2 = 0;

            System.out.print("n = ");
            n = input.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number < min) {
                    min = number;
                    minIndex = i; // birinchi uchragan uchragan eng kichik
                }

                if (number <= min) {
                    minIndex2 = i; // oxirgi uchragan eng kichik
                }

            }

            System.out.println("First min order is " + minIndex);
            System.out.println("Last min order is " + minIndex2);
        }
    }
}
