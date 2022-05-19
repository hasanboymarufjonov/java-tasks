
package Boolean;

import java.util.Scanner;

public class BooleanAdd5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();

        boolean result;

        result = a % 2 == 1 & b % 2 == 1;
        System.out.println(result);
    }
}
