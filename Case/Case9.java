package Case;

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int kun, kun1, oy;

            System.out.print("Kun = ");
            kun1 = input.nextInt();
            System.out.print("Oy = ");
            oy = input.nextInt();

            kun = kun1 + 1;

            switch (oy) {
                case 1 -> System.out.println(kun + " - yanvar");
                case 2 -> System.out.println(kun + " - fevral");
                case 3 -> System.out.println(kun + " - mart");
                case 4 -> System.out.println(kun + " - aprel");
                case 5 -> System.out.println(kun + " - may");
                case 6 -> System.out.println(kun + " - iyun");
                case 7 -> System.out.println(kun + " - iyul");
                case 8 -> System.out.println(kun + " - avgust");
                case 9 -> System.out.println(kun + " - sentabr");
                case 10 -> System.out.println(kun + " - oktabr");
                case 11 -> System.out.println(kun + " - noyabr");
                case 12 -> System.out.println(kun + " - dekabr");
            }
        }

    }
}
