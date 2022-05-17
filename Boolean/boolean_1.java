package Boolean;

import java.util.Scanner;

public class boolean_1 {
    public static void main(String[] args) {
        int a;
        try (Scanner input = new Scanner(System.in)) {
            a = input.nextInt();
        }
        boolean result = a > 0;

        System.out.println(result);
    }
}
