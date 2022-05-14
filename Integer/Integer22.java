package Integer;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        int ns, nst, bs;
        Scanner input = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tdi: ");
        ns = input.nextInt();

        nst = ns / 3600;
        bs = ns - nst * 3600;

        System.out.println(ns + " sekund -> " + nst + " soat " + bs + " sekund");
    }
}
