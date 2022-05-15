package Boolean;

import java.util.Scanner;

public class boolean_19 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();

        d = a + b + c;

        boolean result = (d == a) || (d == b) || (d == c);

        System.out.println(result);
    }
}
