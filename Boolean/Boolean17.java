package Boolean;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        int a;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("a = ");
            a = input.nextInt();
        }

        boolean result = a % 1000 == a && a % 2 == 1;

        System.out.println(result);
    }
}
