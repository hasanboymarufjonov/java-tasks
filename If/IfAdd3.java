package If;

import java.util.Scanner;

public class IfAdd3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("x = ");
            int x = input.nextInt();
            System.out.print("y = ");
            int y = input.nextInt();
            System.out.print("z = ");
            int z = input.nextInt();

            int max = Math.max(x + y + z, x * 100 + y * 10 + z);
            int min = Math.min(x + y + z / 2, x * 100 + y * 10 + z) + 1;

            System.out.println("Max " + max);
            System.out.println("Min" + min);

        }
    }
}