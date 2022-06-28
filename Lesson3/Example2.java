package Lesson3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int k = input.nextInt();
            int a = input.nextInt();

            int b = (k + a) % 7;

            System.out.println(b);
        }
    }
}
