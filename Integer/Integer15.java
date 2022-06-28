package Integer;

import java.util.Scanner;

public class Integer15 {
    public static void main(String[] args) {
        int a, a1, a10, a100, b;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Uch xonali son kiriting: ");
            a = input.nextInt();
        }
        a1 = a % 10; // 1 lar xonasi 3
        a10 = a % 100 / 10; // 10 lar xonasi 2
        a100 = a / 100; // 100 lar xonasi 1

        // 123 -> 213

        b = a10 * 100 + a100 * 10 + a1;

        System.out.println(a + " -> " + b);
    }
}
