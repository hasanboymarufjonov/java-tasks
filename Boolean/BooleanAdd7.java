package Boolean;

import java.util.Scanner;

public class BooleanAdd7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        boolean result;

        result = c * c == a * a + b * b;
        System.out.println(result);
    }
}
