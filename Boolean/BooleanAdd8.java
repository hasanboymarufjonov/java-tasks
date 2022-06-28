package Boolean;

import java.util.Scanner;

public class BooleanAdd8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double a, b, c;
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            boolean result;

            result = a + b > c & b + c > a & a + c > b;

            System.out.println(result);
        }
    }
}
