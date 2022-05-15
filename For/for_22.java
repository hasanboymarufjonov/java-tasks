package gita.foundation.problems_6;

import java.util.Scanner;

public class for_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double n = input.nextDouble();
        double f = 1, d = 1, sum = 1;
        // f - faktorial, d - daraja


        for (int i = 1; i <= n; i++) {

            f *= i; // n!
            d *= x; // xn
            sum += d / f; // + n! / xn

        }

        System.out.println(sum);
    }
}
