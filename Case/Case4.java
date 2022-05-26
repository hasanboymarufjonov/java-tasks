package Case;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 2 -> System.out.println("28, 29");
            case 4, 6, 9, 11 -> System.out.println("30");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
            default -> System.out.println("Error");
        }
    }
}
