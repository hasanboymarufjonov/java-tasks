package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_20 {
    public static void main(String[] args) {
        int ns, nst;
        Scanner input = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tdi: ");
        ns = input.nextInt();

        nst = ns / 3600;

        System.out.println(ns + " -> " + nst);
    }
}
