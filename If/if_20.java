package gita.foundation.problems_4;

import java.util.Scanner;

public class if_20 {
    public static void main(String[] args) {
        int a, b, c, s1, s2;
        Scanner input = new Scanner(System.in);

        System.out.print("A = ");
        a = input.nextInt();
        System.out.print("B = ");
        b = input.nextInt();
        System.out.print("C = ");
        c = input.nextInt();

        s1 = Math.abs(a - b);
        s2 = Math.abs(a - c);

        if (s1 > s2) {
            System.out.println("C, " + s2);
        } else {
            System.out.println("B, " + s1);
        }

    }

}
