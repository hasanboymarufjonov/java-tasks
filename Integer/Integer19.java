package Integer;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        int ns, nm;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Kun boshidan boshlab qancha sekund o'tdi: ");
            ns = input.nextInt();
        }
        nm = ns / 60;

        System.out.println(ns + " -> " + nm);

    }
}
