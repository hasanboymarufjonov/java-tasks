package gita.foundation.problems_5;

import java.util.Scanner;

public class case_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number) {
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("Qoniqarsiz");
            case 3 -> System.out.println("Qoniqarli");
            case 4 -> System.out.println("Yaxshi");
            case 5 -> System.out.println("A'lo");
            default -> System.out.println("Xato");
        }
    }
}
