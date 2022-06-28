package For;

import java.util.Scanner;

public class for_26 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x = input.nextDouble();
            double n = input.nextDouble();
            double d = 1, sum = -1, ishora = -1;
            // f - faktorial, d - daraja

            for (int i = 2; i <= n; i += 2) {

                d *= x; // xn

                sum += ishora * d / i; // + n! / xn

                ishora *= -1;

            }

            System.out.println(sum);
        }
    }
}