
package Minmax;

import java.util.Scanner;

public class Minmax14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int maxIndex = 0;

            System.out.println("b = ");

            int b = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " = ");

                int number = input.nextInt();

                if (number > b) {
                    maxIndex = i;
                }

            }
            if (maxIndex == 0) {
                System.out.println("00");
            } else {
                System.out.println(maxIndex);
            }

        }
    }
}
