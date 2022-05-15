package gita.foundation.problems_3;

import java.util.Scanner;

public class boolean_13 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();

        boolean result = a > 0 || b > 0 || c > 0;

        System.out.println(result);
    }
}
