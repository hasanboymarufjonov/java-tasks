package gita.foundation.problems_5;

import java.util.Scanner;

public class case_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("s: shimol, j: janub, q: sharq, g: g'arb");
        char y = input.next().charAt(0);
        System.out.println("0: davom etish, 1: chap, 2: o'ng");
        int k = input.nextInt();


        switch (y) {
            case 's' -> {
                switch (k) {
                    case 1 -> System.out.println("G'arb");
                    case 2 -> System.out.println("Sharq");
                    default -> System.out.println("Shimol");
                }
            }
            case 'j' -> {
                switch (k) {
                    case 1 -> System.out.println("Sharq");
                    case 2 -> System.out.println("G'arb");
                    default -> System.out.println("Janub");
                }
            }
            case  'q' -> {
                switch (k) {
                    case 1 -> System.out.println("Shimol");
                    case 2 -> System.out.println("Janub");
                    default -> System.out.println("Sharq");
                }
             }
            case 'g' -> {
                switch (k) {
                    case 1 -> System.out.println("Janub");
                    case 2 -> System.out.println("Shimol");
                    default -> System.out.println("G'arb");
                }
            }
            default -> System.out.println("Error");
        }
    }
}
