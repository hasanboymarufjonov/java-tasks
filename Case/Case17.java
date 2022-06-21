package Case;

import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int A, a, b;
            System.out.println("Masalalar sonini:");
            A = input.nextInt();
            a = A / 10;
            b = A % 10;

            switch (a) {
                case 1:
                    System.out.print("O`n");
                    break;
                case 2:
                    System.out.print("Yigirma ");
                    break;
                case 3:
                    System.out.print("O`ttiz ");
                    break;
                case 4:
                    System.out.print("Qirq ");
                    break;
            }

            switch (b) {
                case 0 -> System.out.println(" masala");
                case 1 -> System.out.println(" bitta ");
                case 2 -> System.out.println(" ikkita masala");
                case 3 -> System.out.println(" uchta masala");
                case 4 -> System.out.println(" to`rtta masala");
                case 5 -> System.out.println(" beshta masala");
                case 6 -> System.out.println(" oltita masala");
                case 7 -> System.out.println(" yettita masala");
                case 8 -> System.out.println(" sakkizta masala");
                case 9 -> System.out.println(" to`qqizta masala");
            }
        }
    }
}