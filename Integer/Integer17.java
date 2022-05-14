package Integer;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("999 dan katta son kiriting: ");
        a = input.nextInt();
        /*
         * a1 = a % 10; // 1 lar xonasi
         * a10 = a % 100 / 10; // 10 lar xonasi
         * a100 = a / 100; // 100 lar xonasi
         */

        // 1234 -> 2

        b = a / 100 % 10;

        System.out.println(a + " -> " + b);
    }
}
