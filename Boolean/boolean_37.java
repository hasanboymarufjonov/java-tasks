package B;

import java.util.Scanner;

public class boolean_37 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner input = new Scanner(System.in);

        System.out.print("x1 = ");
        x1 = input.nextInt();
        System.out.print("y1 = ");
        y1 = input.nextInt();
        System.out.print("x2 = ");
        x2 = input.nextInt();
        System.out.print("y2 = ");
        y2 = input.nextInt();

        boolean result = (Math.abs(x1 - x2) == 1 && y1 == y2) || (Math.abs(y1 - y2) == 1 && x1 == x2)
                || (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 1);

        System.out.println(result);
    }
}
