package Boolean;

import java.util.Scanner;

public class BooleanAdd3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b;
            a = input.nextInt();
            b = input.nextInt();

            boolean result;

            result = a > 0 & b < 0 || a < 0 & b > 0;
            System.out.println(result);
        }
    }
}
