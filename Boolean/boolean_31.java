package Boolean;

import java.util.Scanner;

public class boolean_31 {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("a = ");
            a = input.nextInt();
            System.out.print("b = ");
            b = input.nextInt();
            System.out.print("c = ");
            c = input.nextInt();
        }

        boolean result = a == b || b == c || a == c;

        System.out.println(result);
    }
}
