package Boolean;

import java.util.Scanner;

public class boolean_34 {
    public static void main(String[] args) {
        int x, y;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("x = ");
            x = input.nextInt();
            System.out.print("y = ");
            y = input.nextInt();
        }

        boolean result = (x % 2 == 0 && y % 2 == 1) || (x % 2 == 1 && y % 2 == 0);

        System.out.println(result);
    }
}
