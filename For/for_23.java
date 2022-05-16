package For;

import java.util.Scanner;

public class for_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double n = input.nextDouble();
        double f = 1, d = 1, sum = 0, ishora = 1;
        // f - faktorial, d - daraja

        for (int i = 1; i <= n; i += 2) {

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
