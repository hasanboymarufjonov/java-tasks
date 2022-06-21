package Boolean;

import java.util.Scanner;

public class boolean_29 {
    public static void main(String[] args) {

        int x, y, x1, y1, x2, y2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("x = ");
            x = input.nextInt();
            System.out.print("y = ");
            y = input.nextInt();
            System.out.print("x1 = ");
            x1 = input.nextInt();
            System.out.print("y1 = ");
            y1 = input.nextInt();
            System.out.print("x2 = ");
            x2 = input.nextInt();
            System.out.print("y2 = ");
            y2 = input.nextInt();

            boolean result = y < y1 && y > y2 && x > x1 && x < x2;

            System.out.println(result);

        }
    }
}
