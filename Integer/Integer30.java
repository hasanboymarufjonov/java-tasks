package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_30 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        b = (a - 1) / 100 + 1;

        System.out.println(b + " - yuz yillik");

    }
}
