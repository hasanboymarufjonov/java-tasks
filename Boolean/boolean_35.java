package Boolean;

import java.util.Scanner;

public class boolean_35 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("x1 = ");
            x1 = input.nextInt();
            System.out.print("y1 = ");
            y1 = input.nextInt();
            System.out.print("x2 = ");
            x2 = input.nextInt();
            System.out.print("y2 = ");
            y2 = input.nextInt();
        }

        boolean result = (((x1 % 2 == 0 && y1 % 2 == 1)
                || (x1 % 2 == 1 && y1 % 2 == 0) && ((x2 % 2 == 0 && y2 % 2 == 1)) || (x2 % 2 == 1 && y2 % 2 == 0)))
                || (((x1 % 2 == 0 && y1 % 2 == 0) || (x1 % 2 == 1 && y1 % 2 == 1) && ((x2 % 2 == 0 && y2 % 2 == 0))
                        || (x2 % 2 == 1 && y2 % 2 == 1)));

        System.out.println(result);
    }
}
