package Boolean;

import java.util.Scanner;

public class boolean_10 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();

        boolean result = (a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1);

        System.out.println(result);
    }
}
