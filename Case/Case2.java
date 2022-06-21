package Case;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();

            switch (number) {
                case 1 -> System.out.println("Yomon");
                case 2 -> System.out.println("Qoniqarsiz");
                case 3 -> System.out.println("Qoniqarli");
                case 4 -> System.out.println("Yaxshi");
                case 5 -> System.out.println("A'lo");
                default -> System.out.println("Xato");
            }
        }
    }
}
