package Case;

import java.util.Scanner;

public class case_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kun, oy;

        System.out.print("Kun = ");
        kun = input.nextInt();
        System.out.print("Oy = ");
        oy = input.nextInt();

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
