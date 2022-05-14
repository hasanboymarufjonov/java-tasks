package Integer;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        int a, a1, a10;
        Scanner input = new Scanner(System.in);
        System.out.println("Uch xonali son kiriting: ");
        a = input.nextInt();

        a1 = a % 10; // 1 lar xonasi
        a10 = a % 100 / 10; // 10 lar xonasi

        System.out.println(
                a + " ning 10 lar xonasidagi raqami " + a10 + " ga, 1 lar xonasidagi raqami esa " + a1 + " ga teng");
    }
}
