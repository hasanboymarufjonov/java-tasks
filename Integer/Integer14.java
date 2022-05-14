package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_14 {
    public static void main(String[] args) {
        int a, a1, a10, a100, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Uch xonali son kiriting: ");
        a = input.nextInt();

        a1 = a % 10; // 1 lar xonasi
        a10 = a % 100 / 10; // 10 lar xonasi
        a100 = a / 100; // 100 lar xonasi

        // 123 -> 312

        b = a1 * 100 + a100 * 10 + a10;

        System.out.println(a + " ning o'ngdan birinchi raqami o'chirilib chap tomonga yozilsa " + b + " soni hosil bo'ladi");
    }
}
