package If;

import java.util.Scanner;

public class if_22 {
    public static void main(String[] args) {
        int x, y;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X = ");
            x = input.nextInt();
            System.out.print("Y = ");
            y = input.nextInt();
        }

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }

    }
}
