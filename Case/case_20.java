package Case;

import java.util.Scanner;

public class case_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kun = ");
        int kun = input.nextInt();
        System.out.print("Oy = ");
        int oy = input.nextInt();

        if ((oy == 1 && kun >= 20 && kun <= 31) || (oy == 2 && kun >= 1 && kun <= 18)) {
            System.out.println("Qovg'a");
        } else if ((oy == 2 && kun >= 19 && kun <= 28) || (oy == 3 && kun >= 1 && kun <= 20)) {
            System.out.println("Baliq");
        } else if ((oy == 3 && kun >= 21 && kun <= 31) || (oy == 4 && kun >= 1 && kun <= 19)) {
            System.out.println("Qo'y");
        } else if ((oy == 4 && kun >= 20 && kun <= 30) || (oy == 5 && kun >= 1 && kun <= 20)) {
            System.out.println("Buzoq");
        } else if ((oy == 5 && kun >= 21 && kun <= 31) || (oy == 6 && kun >= 1 && kun <= 21)) {
            System.out.println("Egizaklar");
        } else if ((oy == 6 && kun >= 22 && kun <= 30) || (oy == 7 && kun >= 1 && kun <= 22)) {
            System.out.println("Qisqichbaqa");
        } else if ((oy == 7 && kun >= 23 && kun <= 31) || (oy == 8 && kun >= 1 && kun <= 22)) {
            System.out.println("Arslon");
        } else if ((oy == 8 && kun >= 23 && kun <= 31) || (oy == 9 && kun >= 1 && kun <= 22)) {
            System.out.println("Parizod");
        } else if ((oy == 9 && kun >= 23 && kun <= 31) || (oy == 10 && kun >= 1 && kun <= 22)) {
            System.out.println("Tarozi");
        } else if ((oy == 10 && kun >= 23 && kun <= 30) || (oy == 11 && kun >= 1 && kun <= 22)) {
            System.out.println("Chayon");
        } else if ((oy == 11 && kun >= 23 && kun <= 30) || (oy == 12 && kun >= 1 && kun <= 21)) {
            System.out.println("O'qotar");
        } else if ((oy == 12 && kun >= 22 && kun <= 31) || (oy == 1 && kun >= 1 && kun <= 19)) {
            System.out.println("Echki");
        }
    }
}
