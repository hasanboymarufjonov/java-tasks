package Integer;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner input = new Scanner(System.in)) {
            a = input.nextInt();
        }
        b = (a - 1) / 100 + 1;

        System.out.println(b + " - yuz yillik");

    }
}
