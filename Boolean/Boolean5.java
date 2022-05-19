package Boolean;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();

        boolean result = a >= 0 || b < -2;

        System.out.println(result);
    }
}
