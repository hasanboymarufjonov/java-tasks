package Case;

import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kun = ");
        int kun = input.nextInt();

        switch (kun) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                    29 ->
                System.out.println(
                        "Yanvar, Fevral, Mart, Aprel, May, Iyun, Iyul, Avgust, Sentabr, Oktabr, Noyabr, Dekabr");
            case 30 -> System.out.println("Aprel, Iyun, Sentabr, Noyabr");
            case 31 -> System.out.println("Yanvar, Mart, May, Iyul, Avgust, Oktabr, Dekabr");
            default -> System.out.println("Error");
        }
    }
}
