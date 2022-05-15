package gita.foundation.problems_5_0;

import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, a, b;
        System.out.println("Masalalar sonini:");
        A = input.nextInt();
        a = A / 10;
        b = A % 10;

        switch (a) {
            case 1 -> System.out.print("O`n");
            case 2 -> System.out.print("Yigirma ");
            case 3 -> System.out.print("O`ttiz ");
            case 4 -> System.out.print("Qirq ");
            case 5 -> System.out.print("Ellik ");
            case 6 -> System.out.print("Oltmish ");
            case 7 -> System.out.print("Yetmish ");
            case 8 -> System.out.print("Sakson ");
            case 9 -> System.out.print("To'qson ");

        }

        switch (b) {
            case 1 -> System.out.println("bir ");
            case 2 -> System.out.println("ikki");
            case 3 -> System.out.println("uch");
            case 4 -> System.out.println("to`rt");
            case 5 -> System.out.println("besh");
            case 6 -> System.out.println("olti");
            case 7 -> System.out.println("yetti");
            case 8 -> System.out.println("sakkiz");
            case 9 -> System.out.println("to`qqiz");

        }
    }
}
