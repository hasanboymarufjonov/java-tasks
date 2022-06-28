package Boolean;

import java.util.Scanner;

public class boolean_23 {
    public static void main(String[] args) {
        int a, a1, a100;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("a = ");
            a = input.nextInt();
        }

        // 321
        a1 = a % 10; // 1

        a100 = a / 100; // 3

        boolean result = a1 == a100;

        System.out.println(result);

    }
}
