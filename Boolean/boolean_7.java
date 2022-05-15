package gita.foundation.problems_3;

import java.util.Scanner;

public class boolean_7 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();

        // - A -------- B --------- C +
        // - C -------- B --------- A +
        boolean result = (b > a && b < c) || (b > c && b < a);

        System.out.println(result);
    }
}
