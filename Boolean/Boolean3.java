package Boolean;

import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {
        int a;
        try (Scanner input = new Scanner(System.in)) {
            a = input.nextInt();
        }
        boolean result = a % 2 == 0;

        System.out.println(result);
    }
}
