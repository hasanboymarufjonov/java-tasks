package Case;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oy raqami = ");
        int month = input.nextInt();

        switch (month) {
            case 1, 2, 12 -> System.out.println("Qish");
            case 3, 4, 5 -> System.out.println("Bahor");
            case 6, 7, 8 -> System.out.println("Yoz");
            case 9, 10, 11 -> System.out.println("Kuz");
        }
    }
}
