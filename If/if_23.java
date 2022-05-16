package If;

import java.util.Scanner;

public class if_23 {
    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3, x4, y4;
        Scanner input = new Scanner(System.in);

        System.out.print("x1 = ");
        x1 = input.nextInt();
        System.out.print("y1 = ");
        y1 = input.nextInt();
        System.out.print("x2 = ");
        x2 = input.nextInt();
        System.out.print("y2 = ");
        y2 = input.nextInt();
        System.out.print("x3 = ");
        x3 = input.nextInt();
        System.out.print("y3 = ");
        y3 = input.nextInt();

        if (x1 > 0 && y1 > 0 && x2 < 0 && y2 > 0 && x3 < 0 && y3 < 0 && y2 == y1 && Math.abs(x2) == Math.abs(x3)) {
            x4 = x1;
            y4 = y3;
            System.out.println("x4 = " + x4 + ", y4 = " + y4);
        }

    }
}
