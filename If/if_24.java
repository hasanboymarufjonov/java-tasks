package If;

import java.util.Scanner;

public class if_24 {
    public static void main(String[] args) {
        double x;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X = ");
            x = input.nextInt();
        }

        if (x > 0) {
            x = 2 * Math.sin(x);
        } else {
            x = x - 6;
        }

        System.out.println(x);

    }
}
