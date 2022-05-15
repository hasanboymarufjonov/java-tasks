package gita.foundation.problems_5;

import java.util.Scanner;

public class case_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 1, 2, 12 -> System.out.println("Qish");
            case 3, 4, 5 -> System.out.println("Bahor");
            case 6, 7, 8 -> System.out.println("Yoz");
            case 9, 10, 11 -> System.out.println("Kuz");
            default -> System.out.println("Error");
        }
    }
}
