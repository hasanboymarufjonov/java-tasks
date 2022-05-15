package gita.foundation.problems_3_1;

import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        boolean result;

        result = c * c == a * a + b * b;
        System.out.println(result);
    }
}
