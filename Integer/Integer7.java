package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_7 {
    public static void main(String[] args) {
        int a, a1, a2, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Ikki xonali son kiriting: ");
        a = input.nextInt();

        a1 = a / 10;
        a2 = a % 10;

        y = a1 + a2;

        System.out.println(a + " sonining raqamlari yig'indisi " + y + " ga teng");
    }
}
