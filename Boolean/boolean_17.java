package Boolean;

import java.util.Scanner;

public class boolean_17 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();

        boolean result = a % 1000 == a && a % 2 == 1;

        System.out.println(result);
    }
}
