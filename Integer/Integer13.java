package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_13 {
    public static void main(String[] args) {
        int a, a1, a10, a100, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Uch xonali son kiriting: ");
        a = input.nextInt();

        a1 = a % 10; // 1 lar xonasi
        a10 = a % 100 / 10; // 10 lar xonasi
        a100 = a / 100; // 100 lar xonasi

        // 123 -> 231

        b = a10 * 100 + a1 * 10 + a100;

        System.out.println(a + " ning chapdan birinchi raqami o'chirilib o'ng tomonga yozilsa " + b + " soni hosil bo'ladi");
    }
}
