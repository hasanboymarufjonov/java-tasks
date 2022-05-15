package gita.foundation.problems_3;

import java.util.Scanner;

public class boolean_32 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();

        boolean result = (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) || (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) || (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2));

        System.out.println(result);
    }
}
