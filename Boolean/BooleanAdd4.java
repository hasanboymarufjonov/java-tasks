package Boolean;

import java.util.Scanner;

public class BooleanAdd4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a;
            a = input.nextInt();

            boolean result;

            result = a % 2 == 0;
            System.out.println(result);
        }
    }
}
