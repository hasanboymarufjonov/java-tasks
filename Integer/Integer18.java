package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_18 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("999 dan katta son kiriting: ");
        a = input.nextInt();
        /*
        a1 = a % 10; // 1 lar xonasi
        a10 = a % 100 / 10; // 10 lar xonasi
        a100 = a / 100; // 100 lar xonasi
        */

        // 1234 -> 1

        b = a / 1000 % 10;

        System.out.println(a + " -> " +b);
    }
}
