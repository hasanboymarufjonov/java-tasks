package gita.foundation.problems_3;

import java.util.Scanner;

public class boolean_4 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();

        boolean result = a > 2 && b <= 3;

        System.out.println(result);
    }
}
