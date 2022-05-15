package gita.foundation.problems_4;

import java.util.Scanner;

public class if_21 {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.print("X = ");
        x = input.nextInt();
        System.out.print("Y = ");
        y = input.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("0");
        } else if (x == 0 && y != 0) {
            System.out.println("1");
        } else if (y == 0 && x != 0) {
            System.out.println("2");
        } else if (x != 0 && y != 0) {
            System.out.println("3");
        }

    }
}
