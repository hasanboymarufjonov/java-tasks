package Integer;

import java.util.Scanner;

public class IntegerAdd2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("n = ");

            int n = input.nextInt();

            /*
             * 10 -> 99
             * 100 -> 1
             */

            int n2 = n % 10;
            int n1 = n / 10;
            int n12 = n1 + n2;

            System.out.println("n2 = " + n2 + ", n1 = " + n1 + ", n12 = " + n12);
        }
    }

}
