package Minmax;

import java.util.Scanner;

public class Minmax26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int number;
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Son-" + i + ": ");
            number = scanner.nextInt();
            if (number % 2 == 0)
                counter++;
            else
                counter = 0;
            if (counter > max)
                max = Math.max(max, counter);
        }
        System.out.println("Max: " + max);
    }
}
