package If;

import java.util.Scanner;

public class if_17 {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Sonlarni kiriting: ");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
        }

        if (c > b && b > a || a > b && b > c) {
            a = 2 * a;
            b = 2 * b;
            c = 2 * c;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else {
            a = -a;
            b = -b;
            c = -c;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
