package For;

import java.util.Scanner;

public class for_30 {
    public static void main(String[] args) {
        double a, b, n, x;

        try (Scanner input = new Scanner(System.in)) {
            a = input.nextDouble();
            b = input.nextDouble();
            n = input.nextDouble();
        }

        x = (a + b) / n;

        for (int i = 0; i < n; i++) {
            if (a > b) {
                System.out.println(1 - Math.sin(b));
                b += x;
            }
            if (b > a) {
                System.out.println(1 - Math.sin(a));
                a += x;
            }
        }
    }
}
