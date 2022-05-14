package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_21 {
    public static void main(String[] args) {
        int ns, nm, bs;
        Scanner input = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tdi: ");
        ns = input.nextInt();

        nm = ns / 60;
        bs = ns - nm * 60;

        System.out.println(ns + " s -> " + nm + " m " + bs + " s");
    }
}
