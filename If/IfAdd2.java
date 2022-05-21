package If;

import java.util.Scanner;

public class IfAdd2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("x = ");
            int x = input.nextInt();
            System.out.print("y = ");
            int y = input.nextInt();
            System.out.print("z = ");
            int z = input.nextInt();

            int max = Math.max(Math.max(x, y), z);
            int min = Math.min(Math.min(x, y), z);

            System.out.println("Max (" + x + ", " + y + ", " + z + ") = " + max);
            System.out.println("Min (" + x + ", " + y + ", " + z + ") = " + min);

        }
    }
}
