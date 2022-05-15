package Boolean;

import java.util.Scanner;

public class boolean_21 {
    public static void main(String[] args) {
        int a, a1, a10, a100;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        // 123
        a1 = a % 10; // 3
        a10 = a % 100 / 10; // 2
        a100 = a / 100; // 1

        boolean result = a1 > a10 && a10 > a100;

        System.out.println(result);

    }
}
