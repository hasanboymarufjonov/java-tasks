package gita.foundation.problems_3;

import java.util.Scanner;

public class boolean_3 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        boolean result = a % 2 == 0;

        System.out.println(result);
    }
}
