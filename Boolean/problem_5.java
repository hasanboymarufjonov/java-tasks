package gita.foundation.problems_3_1;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();

        boolean result;

        result = a % 2 == 1 & b % 2 ==1;
        System.out.println(result);
    }
}
