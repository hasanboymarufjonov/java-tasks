package If;

import java.util.Scanner;

public class if_10 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Sonlarni kiriting: ");
            a = input.nextInt();
            b = input.nextInt();
        }

        if (a != b) {
            a = a + b;
            b = a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        } else {
            a = 0;
            b = 0;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
