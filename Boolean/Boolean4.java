package Boolean;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("a = ");
            a = input.nextInt();
            System.out.print("b = ");
            b = input.nextInt();
        }
        boolean result = a > 2 && b <= 3;

        System.out.println(result);
    }
}
