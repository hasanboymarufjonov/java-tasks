package Integer;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        int ns, nm, nst, bs;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Kun boshidan boshlab qancha sekund o'tdi: ");
            ns = input.nextInt();
        }
        nst = ns / 3600;
        bs = ns - nst * 3600;
        nm = bs / 60;
        bs = ns - nst * 3600 - nm * 60;

        System.out.println(ns + " sekund -> " + nst + " soat " + nm + " minut " + bs + " sekund");
    }
}
