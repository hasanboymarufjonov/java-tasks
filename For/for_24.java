package For;

import java.util.Scanner;

public class for_24 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x = input.nextDouble();
            double n = input.nextDouble();
            double f = 1, d = 1, sum = -1, ishora = -1;
            // f - faktorial, d - daraja

            for (int i = 2; i <= n; i += 2) {

                f *= i; // n!
                d *= x; // xn

                sum += ishora * d / f; // + n! / xn

                f *= i + 1;
                d *= x;

                ishora *= -1;

            }

            System.out.println(sum);
        }
    }
}
