package gita.foundation.problems_5;

import java.util.Scanner;

public class case_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, a, b, c;
        System.out.println("Son = ");
        A = input.nextInt();
        a = A / 10 / 10 % 10;
        b = A / 10 % 10;
        c = A % 10;
        switch (a) {
            case 1:
                System.out.print("Bir yuz");
                break;
            case 2:
                System.out.print("Ikki yuz");
                break;
            case 3:
                System.out.print("Uch yuz");
                break;
            case 4:
                System.out.print("To`tr yuz");
                break;
            case 5:
                System.out.print("Besh yuz");
                break;
            case 6:
                System.out.print("Olti yuz");
                break;
            case 7:
                System.out.print("Yetti yuz");
                break;
            case 8:
                System.out.print("Sakkiz yuz");
                break;
            case 9:
                System.out.print("To`qqiz yuz");
                break;
        }
        switch (b) {
            case 0 -> System.out.print(" ");
            case 1 -> System.out.print(" o`n ");
            case 2 -> System.out.print(" yigirma ");
            case 3 -> System.out.print(" o`ttiz ");
            case 4 -> System.out.print(" qirq ");
            case 5 -> System.out.print(" ellik ");
            case 6 -> System.out.print(" oltmish");
            case 7 -> System.out.print(" yetmish");
            case 8 -> System.out.print(" sakson");
            case 9 -> System.out.print(" to`qson");
        }
        switch (c) {
            case 0 -> System.out.println(" ");
            case 1 -> System.out.println(" bir ");
            case 2 -> System.out.println(" ikki ");
            case 3 -> System.out.println(" uch ");
            case 4 -> System.out.println(" to`rt ");
            case 5 -> System.out.println(" besh ");
            case 6 -> System.out.println(" olti ");
            case 7 -> System.out.println(" yetti ");
            case 8 -> System.out.println(" sakkiz ");
            case 9 -> System.out.println(" to`qqiz ");
        }
    }

}
