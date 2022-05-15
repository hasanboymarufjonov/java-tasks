package gita.foundation.problems_3;

import java.util.Scanner;

public class boolean_26 {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.print("x = ");
        x = input.nextInt();
        System.out.print("y = ");
        y = input.nextInt();

        boolean result = y < 0 && x > 0;

        System.out.println(result);
    }
}
