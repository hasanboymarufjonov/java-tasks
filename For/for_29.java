package gita.foundation.problems_6;

import java.util.Scanner;

public class for_29 {
    public static void main(String[] args) {
        double a, b, n, x;

        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        n = input.nextDouble();

        x = (a + b) / n;

        for (int i = 0; i < n; i++) {
         if (a > b) {
             System.out.println(b);
             b += x;
         }
         if (b > a) {
             System.out.println(a);
             a += x;
         }
        }
    }
}
