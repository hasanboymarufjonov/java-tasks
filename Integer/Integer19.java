package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_19 {
    public static void main(String[] args) {
        int ns, nm;
        Scanner input = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tdi: ");
        ns = input.nextInt();

        nm = ns / 60;

        System.out.println(ns + " -> " + nm);

    }
}
