package If;

import java.util.Scanner;

public class IfAdd1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("x = ");
            int x = input.nextInt();
            System.out.println("y = ");
            int y = input.nextInt();

            if (x > y) {
                System.out.println("x katta");
            } else if (y > x) {
                System.out.println("y katta");
            }
        }
    }
}
