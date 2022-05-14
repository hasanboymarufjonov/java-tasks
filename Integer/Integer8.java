package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_8 {
    public static void main(String[] args) {
        int a, a1, a2, t;
        Scanner input = new Scanner(System.in);
        System.out.println("Ikki xonali son kiriting: ");
        a = input.nextInt();

        a1 = a / 10;
        a2 = a % 10;

        t = a2 * 10 + a1;

        System.out.println(a + " ning raqamlari almashtirilsa " + t + " soni hosil bo'ladi");
    }
}
