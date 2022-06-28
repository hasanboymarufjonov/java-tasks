package If;

import java.util.Scanner;

public class if_29 {
    public static void main(String[] args) {
        double x;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Son = ");
            x = input.nextInt();
        }

        if (x > 0 && x % 2 == 1) {
            System.out.println("Musbat, toq son");
        } else if (x > 0 && x % 2 == 0) {
            System.out.println("Musbat, juft son");
        } else if (x < 0 && x % 2 == 1) {
            System.out.println("Manfiy, toq son");
        } else if (x < 0 && x % 2 == 0) {
            System.out.println("Manfiy, juft son");
        }
    }
}
