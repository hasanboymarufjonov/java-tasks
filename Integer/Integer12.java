package Integer;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        int a, a1, a10, a100, t;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Uch xonali son kiriting: ");
            a = input.nextInt();
        }
        a1 = a % 10; // 1 lar xonasi
        a10 = a % 100 / 10; // 10 lar xonasi
        a100 = a / 100; // 100 lar xonasi

        t = a1 * 100 + a10 * 10 + a100;

        System.out.println(a + " ning raqamlari almashtirilsa " + t + " soni hosil bo'ladi");

    }
}
