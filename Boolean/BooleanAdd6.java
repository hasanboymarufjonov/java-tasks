package Boolean;

import java.util.Scanner;

public class BooleanAdd6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b;
            a = input.nextInt();
            b = input.nextInt();

            boolean result;

            result = a % 2 == 1 & b % 2 == 0 || a % 2 == 0 & b % 2 == 1;
            System.out.println(result);
        }
    }
}
