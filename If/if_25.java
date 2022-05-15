package gita.foundation.problems_4;

import java.util.Scanner;

public class if_25 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("X = ");
        x = input.nextInt();

        if (x < -2 || x > 2) {
            x = 2 * x;
        } else {
            x = -3 * x;
        }

        System.out.println(x);

    }
}
