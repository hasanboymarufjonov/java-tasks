package Integer;

import java.util.Scanner;

public class IntegerAdd1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("n = ");

            int n = input.nextInt();

            /*
             * 100 -> 999
             * 100 -> 1
             * 999 -> 9
             * 123 -> 1
             * 987 -> 912
             */

            int n100 = n / 100;

            System.out.println("n100 = " + n100);
        }
    }

}
