package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_11 {
    public static void main(String[] args) {
        int a, a1, a10, a100, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Uch xonali son kiriting: ");
        a = input.nextInt();

        a1 = a % 10; // 1 lar xonasi
        a10 = a % 100 / 10; // 10 lar xonasi
        a100 = a / 100; // 100 lar xonasi

        y = a1 + a10 + a100;

        System.out.println(a + " sonining raqamlar yig'indisi " + y + " ga teng");
    }
}
