package Boolean;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();

        boolean result = a % 100 == a && a % 2 == 0;

        System.out.println(result);
    }
}
