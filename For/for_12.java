package For;

import java.util.Scanner;

public class for_12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("n = ");
            int n = input.nextInt();

            double c = 1, a = 1;
            for (double i = 0; i < n; i++) {
                a = a + 0.1;
                c = c * a;
            }
            System.out.printf("%.4f%n", c);
        }
    }
}
